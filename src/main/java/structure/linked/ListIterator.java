package structure.linked;

public class ListIterator {

	private Link current;
//	private Link previous;
	private LinkList theList;

	public void reset() {
		current = theList.getFirst();
//		previous = null;
	}

	public void nextLink() {
//		previous = current;
		current = current.next;
	}

	public Link getCurrent() {
		return current;
	}

	public boolean atEnd() {
		return current.next == null;
	}

	public Link deleteCurrent() {
		// TODO
		return null;
	}

}
