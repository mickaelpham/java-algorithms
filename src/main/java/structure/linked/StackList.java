package structure.linked;

public class StackList {

	private LinkList theList;

	public StackList() {
		theList = new LinkList();
	}

	public void push(int el) {
		theList.insertFirst(el, 0);
	}

	public int pop() {
		if (!theList.isEmpty())
			return theList.deleteFirst().getIData();
		else
			return -1;
	}

	public int peek() {
		if (!theList.isEmpty())
			return theList.getFirst().getIData();
		else
			return -1;
	}

	public boolean isEmpty() {
		return theList.isEmpty();
	}

	public boolean isFull() {
		return false;
	}

}
