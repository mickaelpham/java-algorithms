package structure.linked.circular;

public class CircularList {

	private Link lastInserted;

	public CircularList() {
		lastInserted = null;
	}

	public Link getLastInserted() {
		return lastInserted;
	}

	public void insert(int key, String data) {
		Link newLink = new Link(key, data);
		if (lastInserted == null) {
			lastInserted = newLink;
			// Reference to itself
			newLink.setNext(newLink);
			newLink.setPrevious(newLink);
		} else {
			newLink.setNext(lastInserted.getNext());
			newLink.setPrevious(lastInserted);
			lastInserted.getNext().setPrevious(newLink);
			lastInserted.setNext(newLink);
			lastInserted = newLink;
		}
	}

	public Link removeLastInserted() {
		if (isEmpty())
			return null;

		Link tmp = lastInserted;

		if (lastInserted.getNext() == lastInserted) {
			lastInserted = null;
		} else {
			lastInserted.getPrevious().setNext(lastInserted.getNext());
			lastInserted.getNext().setPrevious(lastInserted.getPrevious());
			lastInserted = lastInserted.getPrevious();
		}

		return tmp;
	}

	public boolean isEmpty() {
		return lastInserted == null;
	}

	public String toString() {
		CircularIterator iterator = new CircularIterator(this);
		StringBuilder sb = new StringBuilder();
		if (!isEmpty()) {
			do {
				sb.append(iterator.getCurrent().toString() + " ");
				iterator.next();
			} while (iterator.getCurrent() != lastInserted);
		}
		return sb.toString();
	}

}
