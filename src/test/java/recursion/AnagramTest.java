package recursion;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

	@Test
	public void simpleRotateTest() {
		String[] expecteds = new String[] { "atc", "tca", "cat" };
		String word = "cat";
		for (int i = 0; i < expecteds.length; i++) {
			word = Anagram.rotate(word);
			Assert.assertEquals(expecteds[i], word);
		}
	}

	@Test
	public void testAnagram() {
		String[] expecteds = new String[] { "cat", "cta", "atc", "act", "tca",
				"tac" };
		Assert.assertArrayEquals(expecteds, Anagram.doAnagram("cat"));
		// Test with a bigger word.
		String word = "TRAUMA";
		// The # of possibilities is n!
		Assert.assertEquals(Factorial.factorial(word.length()),
				Anagram.doAnagram(word).length);
	}

}
