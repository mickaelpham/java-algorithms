package problems;

import structure.linked.circular.CircularIterator;
import structure.linked.circular.CircularList;
import structure.linked.circular.KeyNotFoundException;

/**
 * The Josephus Problem is a famous mathematical puzzle that goes back to
 * ancient times. Josephus was one of a group of Jews who were about to be
 * captured by the Romans. Rather than be enslaved, they chose to commit
 * suicide.
 * 
 * They arranged themselves in a circle and, starting at a certain person,
 * started counting off around the circle. Every Nth person had to leave the
 * circle and commit suicide. Josephus decided he didn't want to die, so he
 * arranged the rules so he would be the last person left.
 * 
 * If there were (say) 20 people, and he was the seventh person from the start
 * of the circle, what number should he tell them to use for counting off? The
 * problem is made much more complicated because the circle shrinks as the
 * counting continues.
 * 
 * Create an application that uses a circular linked list to model this problem.
 * Inputs are (1) the number of people in the circle, (2) the number used for
 * counting off, and (3) the number of the person where counting starts (usually
 * it's the first person).
 * 
 * The output is the list of persons being eliminated. When a person drops out
 * of the circle, counting starts again from the person who was on his left
 * (assuming you go around clockwise).
 */
public class JosephusProblem {

	private CircularList list;
	private CircularIterator iterator;
	private String[] persons;
	private int startingWith;
	private int josephPosition;
	
	public JosephusProblem(String[] persons, int startingWith,
			int josephPosition) {
		
		this.persons = persons;
		this.josephPosition = josephPosition;
		
		if (startingWith < 0 || startingWith >= persons.length)
			this.startingWith = 0;
		else
			this.startingWith = startingWith;
	}
	
	/**
	 * Return the solution to the Josephus Problem after trying all the
	 * possibilities (number to count of by)
	 * @return
	 */
	public int solve() {
		int hopBySolution = 0;
		int bestAttempt = 0;
		for (int hopBy = 0; hopBy < persons.length; hopBy++) {
			populateList();
			int attempt = 1;
			while (!list.isEmpty() && iterator.getCurrent().getKey()
					!= josephPosition) {
				iterator.removeCurrent();
				iterator.hop(hopBy);
				attempt++;
			}
//			System.out.println("Counting off by: " + hopBy + " | Joseph leaves "
//					+ "at: " + attempt);
			if (bestAttempt < attempt) {
				bestAttempt = attempt;
				hopBySolution = hopBy;
			}
		}
		return hopBySolution;
	}
	
	private void populateList() {
		list = new CircularList();
		
		for (int i = 0; i < persons.length; i++)
			list.insert(i, persons[i]);
		
		iterator = new CircularIterator(list);
		
		try {
			iterator.setCurrent(startingWith);
		} catch (KeyNotFoundException e) {
			e.printStackTrace();
		}
	}

}
