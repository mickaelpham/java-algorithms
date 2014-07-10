package structure;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import stucture.PriorityQueue;

public class PriorityQueueTest {

	private static final int MAX_SIZE = 50;
	private static final int MAX_RANDOM = 1000;

	@Ignore
	@Test
	public void simplePriorityQueueTest() {
		PriorityQueue q = new PriorityQueue(MAX_SIZE);
		q.insert(33);
		q.insert(12);
		while (!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}
		System.out.println("");
	}

	@Test
	public void testPriorityQueueWithSomeRandomNumbers() {
		Random rn = new Random();
		PriorityQueue q = new PriorityQueue(MAX_SIZE);
		long[] expected = new long[MAX_SIZE];
		for (int i = 0; i < MAX_SIZE; i++) {
			int random = rn.nextInt(MAX_RANDOM);
			System.out.println("random: " + random);
			q.insert(random);
			expected[i] = random;
		}
		long[] actual = new long[MAX_SIZE];
		int i = 0;
		while (!q.isEmpty()) {
			actual[i] = q.remove();
			i++;
		}
		Arrays.sort(expected);
		Assert.assertArrayEquals(expected, actual);
	}

}
