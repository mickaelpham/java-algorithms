package recursion;

import org.junit.Assert;
import org.junit.Test;

public class TriangularNumberTest {

	private static final int NTH_NUMBER_MAX = 1000;

	@Test
	public void testLoopTriangleWithoutRecursion() {
		int[] expecteds = new int[] { 1, 3, 6, 10, 15, 21, 28, 36 };
		for (int i = 0; i < expecteds.length; i++)
			Assert.assertEquals(expecteds[i], TriangularNumber.triangle(i + 1));
	}

	@Test
	public void testTriangleWithRecursion() {
		int[] expecteds = new int[] { 1, 3, 6, 10, 15, 21, 28, 36 };
		for (int i = 0; i < expecteds.length; i++) {
			Assert.assertEquals(expecteds[i], TriangularNumber
					.triangleRecursion(i + 1));
		}
	}

	@Test
	public void testAllTriangleMethods() {
		for (int i = 1; i <= NTH_NUMBER_MAX; i++) {
			int expected = TriangularNumber.triangleMath(i);
			Assert.assertEquals(expected, TriangularNumber.triangle(i));
			Assert.assertEquals(expected, TriangularNumber
					.triangleRecursion(i));
		}
	}
}
