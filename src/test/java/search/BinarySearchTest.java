package search;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import util.Tool;

public class BinarySearchTest {
	
	private static final int MAX_SMALL_ARRAY = 100;
	private static final int MAX_RANDOM = 1000;
	private static final int SEARCH_NUMBER = 99;

	@Test
	public void searchInSmallArray() {
		int[] a = new int[MAX_SMALL_ARRAY];
		for (int i = 0; i < MAX_SMALL_ARRAY; i++) {
			a[i] = i + 1;
		}
		BinarySearch bs = new BinarySearch(a, true);
		int indexFound = bs.find(SEARCH_NUMBER);
		Assert.assertEquals(SEARCH_NUMBER, a[indexFound]);
	}
	
	@Test
	public void testInRandomArrayAndCompareToJDK() {
		int[] a = Tool.generateRandomArray(MAX_SMALL_ARRAY, MAX_RANDOM);
		BinarySearch bs = new BinarySearch(a, false);
		int indexFound = bs.find(SEARCH_NUMBER);
		Arrays.sort(a);
		Assert.assertEquals(Arrays.binarySearch(a, SEARCH_NUMBER), indexFound);
	}
}
