package structure.linked.circular;

public class Link {

	private int key;
	private String data;
	private Link next;
	private Link previous;

	public Link(int key, String data) {
		setKey(key);
		setData(data);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public Link getPrevious() {
		return previous;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}

	public String toString() {
		return "{ " + key + ": " + data + " }";
	}

}
