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
