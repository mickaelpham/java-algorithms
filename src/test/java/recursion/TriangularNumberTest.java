package recursion;

import org.junit.Assert;
import org.junit.Test;

public class TriangularNumberTest {

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
			Assert.assertEquals(expecteds[i],
					TriangularNumber.triangleRecursion(i + 1));
		}
	}

}
