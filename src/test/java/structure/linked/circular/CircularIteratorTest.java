package structure.linked.circular;

import org.junit.Assert;
import org.junit.Test;

public class CircularIteratorTest {

	@Test
	public void simpleCircularIteratorTest() {
		String[] data = new String[] { "abc", "def", "ijkl", "mno" };
		CircularList list = new CircularList();

		for (int i = 0; i < data.length; i++)
			list.insert(i, data[i]);
		
		CircularIterator iterator = new CircularIterator(list);
		
		String[] expecteds = new String[] { "mno", "abc", "def", "ijkl" };
		String[] actuals = new String[expecteds.length];
		
		for (int i = 0; i < actuals.length; i++) {
			actuals[i] = iterator.getCurrent().getData();
			iterator.next();
		}
		
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
