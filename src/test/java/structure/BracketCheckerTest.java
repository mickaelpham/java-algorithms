package structure;

import org.junit.Assert;
import org.junit.Test;

import stucture.BracketChecker;

public class BracketCheckerTest {

	@Test
	public void testValidInput() {
		String valid = "(a{bwec[ddfgdf]ef}g)";
		BracketChecker bc = new BracketChecker(valid);
		Assert.assertTrue(bc.check());
	}
	
	@Test
	public void testInvalidInput() {
		String invalid = "{a(b[d}e]d)f]";
		BracketChecker bc = new BracketChecker(invalid);
		Assert.assertFalse(bc.check());
	}
}
