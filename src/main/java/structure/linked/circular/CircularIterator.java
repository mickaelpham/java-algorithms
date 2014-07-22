package structure.linked.circular;

public class CircularIterator {

	private Link current;
	private CircularList theList;

	public CircularIterator(CircularList list) {
		theList = list;
		current = list.getLastInserted();
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

	public void setCurrent(int key) throws KeyNotFoundException {
		Link tmp = current;
		while (key != current.getKey()) {
			next();
			if (current == tmp)
				throw new KeyNotFoundException();
		}
	}

}
