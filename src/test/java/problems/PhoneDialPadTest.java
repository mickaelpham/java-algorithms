package problems;

import org.junit.Assert;
import org.junit.Test;

public class PhoneDialPadTest {
	
	private static final String USER_INPUT = "2225";
	private static final String WORD_CHECK = "BACK";
	private static final int NUMBER_OF_WORDS = 81;

	@Test
	public void testDialPadWithSimpleInput() {
		PhoneDialPad pdp = new PhoneDialPad(USER_INPUT);
		Assert.assertEquals(NUMBER_OF_WORDS, pdp.getNumberOfPossibleWords());
		Assert.assertTrue(pdp.getWords().contains(WORD_CHECK));
	}
	
}
