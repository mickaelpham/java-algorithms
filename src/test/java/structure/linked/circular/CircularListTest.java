package structure.linked.circular;

import org.junit.Assert;
import org.junit.Test;

public class CircularListTest {

	@Test
	public void simpleCircularListTest() {
		String[] data = new String[] { "abc", "def", "ijkl", "mno" };
		CircularList list = new CircularList();

		for (int i = 0; i < data.length; i++)
			list.insert(i, data[i]);

		for (int i = data.length - 1; i >= 0; i--)
			Assert.assertEquals(data[i], list.removeLastInserted().getData());
	}

}
