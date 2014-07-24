package util;

import org.junit.Assert;
import org.junit.Test;

public class ToolTest {

	@Test
	public void testIfStringContainsUniqueChars() {
		String input;
		input = "bonjour les enfants";
		Assert.assertFalse(Tool.containsUniqueChars(input));
		input = "abcdefghijklmnopqrstuvwxyz";
		Assert.assertTrue(Tool.containsUniqueChars(input));
	}

	@Test
	public void testIfStringIsPermutationOfTheOther() {
		String input = "bonjour les enfants";
		String compareTo = "stnafne sel ruojnob";
		Assert.assertTrue(Tool.isPermutation(input, compareTo));
		compareTo = "stnafne sel ruojnoc";
		Assert.assertFalse(Tool.isPermutation(input, compareTo));
	}

	@Test
	public void testJoinStringMethod() {
		String expected = "Id, Name, Contact";
		String[] input = new String[] { "Id", "Name", "Contact" };
		Assert.assertEquals(expected, Tool.join(input, ", "));
	}

	@Test
	public void testPower() {
		Assert.assertEquals(256.0, Tool.power(2.0, 8.0), 0.0);
		Assert.assertEquals(256, Tool.power(2, 8));
	}
}
