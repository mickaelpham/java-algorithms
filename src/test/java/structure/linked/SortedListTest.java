package structure.linked;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class SortedListTest {

	private static final int MAX_RANDOM = 10000;
	private static final int MAX_NUMBERS = 1000;

	@Test
	public void simpleSortedListTest() {
		SortedList theList = new SortedList();

		theList.insert(50);
		theList.insert(40);
		theList.insert(20);
		theList.insert(60);
		theList.insert(10);
		theList.insert(80);

		int[] expecteds = new int[] { 10, 20, 40, 50, 60, 80 };
		int[] actuals = new int[expecteds.length];

		int i = 0;
		while (!theList.isEmpty())
			actuals[i++] = theList.remove().getIData();

		Assert.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSortedLinkedListWithRandomNumbers() {
		Random rn = new Random();
		SortedList theList = new SortedList();

		int[] expecteds = new int[MAX_NUMBERS];
		int[] actuals = new int[MAX_NUMBERS];

		for (int i = 0; i < MAX_NUMBERS; i++) {
			int randomInt = rn.nextInt(MAX_RANDOM);
			theList.insert(randomInt);
			expecteds[i] = randomInt;
		}

		Arrays.sort(expecteds);

		int i = 0;
		while (!theList.isEmpty())
			actuals[i++] = theList.remove().getIData();

		Assert.assertArrayEquals(expecteds, actuals);
	}

}
