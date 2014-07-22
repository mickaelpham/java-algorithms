package structure.linked.circular;

public class CircularIterator {

	private Link current;
	private CircularList theList;

	public CircularIterator(CircularList list) {
		setTheList(list);
		setCurrent(theList.getLastInserted());
	}

	public void next() {
		current = current.getNext();
	}

	public Link removeCurrent() {
		if (theList.isEmpty())
			return null;

		Link tmp = current;

		if (current == current.getNext()) {
			current = null;
			theList.removeLastInserted();
		} else {
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current = current.getNext();
		}

		return tmp;
	}

	public Link getCurrent() {
		return current;
	}

	public void setCurrent(Link current) {
		this.current = current;
	}

	public CircularList getTheList() {
		return theList;
	}

	public void setTheList(CircularList theList) {
		this.theList = theList;
	}

}
