package structure.linked;

public class QueueList {

	private LinkList theList;

	public QueueList() {
		theList = new LinkList();
	}

	public void insert(int el) {
		theList.insertLast(el, 0);
	}

	public int remove() {
		if (theList.isEmpty())
			return -1;
		else
			return theList.deleteFirst().getIData();
	}

	public int peek() {
		if (theList.isEmpty())
			return -1;
		else
			return theList.getFirst().getIData();
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return theList.isEmpty();
	}

}
