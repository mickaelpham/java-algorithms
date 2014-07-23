package recursion;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

	private static final int NTH_MAX_NUMBER = 1000;

	@Test
	public void simpleFactorialTest() {
		// Test base case.
		Assert.assertEquals(1, Factorial.factorial(0));
		Assert.assertEquals(1, Factorial.factorialRecursion(0));

		for (int i = 0; i < NTH_MAX_NUMBER; i++)
			Assert.assertEquals(Factorial.factorial(i),
					Factorial.factorialRecursion(i));
	}
}
