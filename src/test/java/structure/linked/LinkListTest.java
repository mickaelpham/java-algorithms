package structure.linked;

import org.junit.Assert;
import org.junit.Test;

public class LinkListTest {
	
	@Test
	public void simpleLinkListTest() {
		LinkList theList = new LinkList();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
//		theList.displayList();
		
		double[] deleted = new double[4];
		int indexDeleted = 0;
		while (!theList.isEmpty()) {
			Link del = theList.deleteFirst();
			deleted[indexDeleted++] = del.getDData();
//			System.out.print("Deleted: ");
//			del.displayLink();
//			System.out.println("");
		}
		
		double[] expected = new double[] { 8.99, 6.99, 4.99, 2.99 };
		Assert.assertArrayEquals(expected, deleted, 0);
	}
	
	@Test
	public void testFindAndDeletionWithKey() {
		LinkList theList = new LinkList();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
//		theList.displayList();
		Link deleted = theList.delete(66);
//		theList.displayList();
		
		Assert.assertEquals(6.99, deleted.getDData(), 0);
		
		deleted = theList.delete(22);
		Assert.assertEquals(2.99, deleted.getDData(), 0);
	}

}
