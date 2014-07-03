package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import sort.SortArray.Implementation;
import util.Tool;

public class SortArrayTest {

	private static final int MAX_SIZE = 100000;
	private static final int MAX_RANDOM = 1000;

	@Test
	public void testAndCompareSortArrayImplementation() {
		long start, stop;
		Map<Implementation, Long> timeElapsedPerImplementation =
				new HashMap<Implementation, Long>();
		// Setup the test array.
		int[] testArray = Tool.generateRandomArray(MAX_SIZE, MAX_RANDOM);
		// Test the bubble sort implementation
		SortArray bubbleSort = new BubbleSortArray();
		bubbleSort.setArray(Arrays.copyOf(testArray, testArray.length));
		start = System.nanoTime();
		bubbleSort.sort();
		stop = System.nanoTime();
		timeElapsedPerImplementation.put(bubbleSort.getImplementation(),
				(stop - start));
		// Test the selection sort implementation
		SortArray selectionSort = new SelectionSortArray();
		selectionSort.setArray(Arrays.copyOf(testArray, testArray.length));
		start = System.nanoTime();
		selectionSort.sort();
		stop = System.nanoTime();
		timeElapsedPerImplementation.put(selectionSort.getImplementation(),
				(stop - start));
		// Compare and make sure selection sort is better than bubble sort
		Assert.assertTrue(timeElapsedPerImplementation.get(
				Implementation.BUBBLESORT) > timeElapsedPerImplementation.get(
				Implementation.SELECTION));
	}

}
