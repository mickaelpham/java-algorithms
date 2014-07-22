package problems;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class JosephusProblemTest {

	@Test
	public void testSolving() {
		String[] persons = new String[] { "Tony", "Tasha", "Mindy",
				"Christine", "Marcia", "Gary", "Joseph", "Cynthia", "Erik",
				"Geraldine", "Kim", "Taylor", "Norman", "Paul", "Romain",
				"Claire", "Alex", "Maksim", "Daniel", "Jennifer" };
		
		JosephusProblem problem = new JosephusProblem(persons, 0, Arrays
				.asList(persons).indexOf("Joseph"));
		
		Assert.assertEquals(9, problem.solve());
	}
}
