package structure.linked;

public class DoublyLinkedList {

	private DLink first;
	private DLink last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(long el) {
		DLink newLink = new DLink(el);
		
		if (isEmpty())
			last = newLink;
		else
			first.setPrevious(newLink);
		
		newLink.setNext(first);
		first = newLink;
	}
	
	public void insertLast(long el) {
		DLink newLink = new DLink(el);
		
		if (isEmpty())
			first = newLink;
		else
			last.setNext(newLink);
		
		newLink.setPrevious(last);
		last = newLink;
	}

}
