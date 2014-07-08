package problems;

import org.junit.Assert;
import org.junit.Test;

public class PhoneDialPadTest {

	@Test
	public void testDialPadWithSimpleInput() {
		String input = "2225";
		PhoneDialPad pdp = new PhoneDialPad(input);
		Assert.assertTrue(pdp.getWords().contains("BACK"));
	}
	
}
