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
}
