package structure.linked;

public class LinkList {

	// Reference to first link on the list.
	private Link first;

	// Reference to last link, improve insertion at the end of the list.
	private Link last;

	public LinkList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id, double dd) {
		Link link = new Link(id, dd);

		if (isEmpty())
			last = link;

		link.next = first;
		first = link;
	}

	public void insertLast(int id, double dd) {
		Link newLink = new Link(id, dd);

		if (isEmpty())
			first = newLink;
		else
			last.next = newLink;

		last = newLink;
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
