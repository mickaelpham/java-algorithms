package sort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import util.Tool;

public class SelectionSortArrayTest {

	private static final int MAX_SIZE = 10;
	private static final int MAX_RANDOM = 100;

	@Test
	public void simpleSelectionSortArrayTest() {
		int[] a = Tool.generateRandomArray(MAX_SIZE, MAX_RANDOM);
		int[] expected = Arrays.copyOf(a, a.length);
		Arrays.sort(expected);
		SortArray sa = new SelectionSortArray();
		sa.setArray(a);
		sa.sort();
		Assert.assertArrayEquals(expected, sa.getArray());
	}

}
