package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a function that can tell you if a String is a valid English
 * word or not. Given a number, corresponding to a dialpad input, write a method
 * that can list all the word possibles with it.
 * 
 * E.g. the entry "2225" can be translated as "BACK" on the dialpad.
 * 
 * Hint: use recursion.
 */
public class PhoneDialPad {

	// String array used to retrieve number to letters equivalent.
	private String[] letters = { "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO",
			"PQRS", "TUV", "WXYZ" };

	private String input;

	private List<String> words;
	
	private int numberOfPossibleWords;

	public PhoneDialPad(String userInput) {
		input = userInput;
		numberOfPossibleWords = -1;
	}

	public List<String> getWords() {
		if (words == null)
			words = getAllWords();
		return words;
	}
	
	public int getNumberOfPossibleWords() {
		if (numberOfPossibleWords < 0) {
			numberOfPossibleWords = 1;
			for (int i = 0; i < input.length(); i++) {
				int letterIndex = Integer.valueOf(input.substring(i, i + 1));
				numberOfPossibleWords *= letters[letterIndex].length();
			}
		}
		return numberOfPossibleWords;
	}

	private List<String> getAllWords() {
		List<String> results = new ArrayList<String>();
		recursiveExploreLetters("", input, results);
		return results;
	}

	private void recursiveExploreLetters(String prefix, String input,
			List<String> results) {
		int letterIndex = Integer.valueOf(input.substring(0, 1));
		for (int i = 0; i < letters[letterIndex].length(); i++) {
			if (input.length() > 1) {
				recursiveExploreLetters(
						prefix + letters[letterIndex].charAt(i),
						input.substring(1), results);
			} else {
				results.add(prefix + letters[letterIndex].charAt(i));
			}
		}
	}

}
