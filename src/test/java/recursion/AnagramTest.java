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

}
