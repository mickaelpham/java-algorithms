package structure.linked;

public class LinkList {

	// Reference to first link on the list.
	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id, double dd) {
		Link link = new Link(id, dd);
		link.next = first;
		first = link;
	}

	public Link deleteFirst() {
		Link tmp = first;
		first = first.next;
		return tmp;
	}

	public Link find(int key) {
		if (isEmpty())
			return null;
		Link current = first;
		while (current != null) {
			if (current.getIData() == key)
				return current;
			else
				current = current.next;
		}
		// Reach the end of the list, could not find the key.
		return null;
	}
	
	public Link delete(int key) {
		if (isEmpty())
			return null;
		else if (first.getIData() == key)
			return deleteFirst();
		else {
			Link previous = first;
			Link current = first.next;
			while (current != null) {
				if (current.getIData() == key) {
					previous.next = current.next;
					return current;
				} else {
					previous = current;
					current = current.next;
				}
			}
			return null;
		}
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		if (!isEmpty())
			displayRecursive(first);
		System.out.println("");
	}

	private void displayRecursive(Link link) {
		link.displayLink();
		if (link.next != null)
			displayRecursive(link.next);
	}

}
