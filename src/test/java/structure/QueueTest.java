package structure;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import structure.Queue;

public class QueueTest {

	private static final int MAX_SIZE = 100;
	private static final int MAX_RANDOM = 1000;

	private Random rn;
	private Queue queue;

	@Before
	public void initialize() {
		rn = new Random();
		queue = new Queue(MAX_SIZE);
	}

	@Test
	public void simpleStackTest() {
		long n = Long.valueOf(rn.nextInt(MAX_RANDOM));
		queue.insert(n);
		Assert.assertEquals(n, queue.peek());
		Assert.assertEquals(n, queue.remove());
	}

	@Test
	public void testCircularQueue() {
		int twiceTheSize = 2 * MAX_SIZE;
		long[] inserted = new long[twiceTheSize];
		int counterRemoved = 0;
		// Let's insert X elements and remove X/2.
		for (int i = 0; i < twiceTheSize; i++) {
			// Two steps forward...
			inserted[i] = rn.nextInt(MAX_RANDOM);
			queue.insert(inserted[i]);
			// One step backward.
			if (i % 2 == 0) {
				Assert.assertEquals(inserted[counterRemoved], queue.remove());
				counterRemoved++;
			}
		}
		// Remove the rest of the queue.
		while (!queue.isEmpty()) {
			Assert.assertEquals(inserted[counterRemoved], queue.remove());
			counterRemoved++;
		}
	}

}
