package structure.linked.circular;

public class CircularIterator {

	private Link current;
	private Link previous;
	private CircularList theList;

	public CircularIterator(CircularList list) {
		setTheList(list);
		setCurrent(theList.getLastInserted());
		setPrevious(theList.getLastInserted().getPrevious());
	}

	public void next() {
		previous = current;
		current = current.getNext();
	}

	public Link removeCurrent() {
		if (theList.isEmpty())
			return null;
		return null;
	}

	public Link getCurrent() {
		return current;
	}

	public void setCurrent(Link current) {
		this.current = current;
	}

	public Link getPrevious() {
		return previous;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}

	public CircularList getTheList() {
		return theList;
	}

	public void setTheList(CircularList theList) {
		this.theList = theList;
	}

}
