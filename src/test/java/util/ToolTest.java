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
}
