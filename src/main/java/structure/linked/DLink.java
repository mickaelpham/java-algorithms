package structure.linked;

public class DLink {

	private long key;
	private long data;
	private DLink next;
	private DLink previous;

	public DLink(long data) {
		setData(data);
		setNext(null);
		setPrevious(null);
	}

	public DLink(long key, long data) {
		setKey(key);
		setData(data);
		setNext(null);
		setPrevious(null);
	}

	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	public DLink getNext() {
		return next;
	}

	public void setNext(DLink next) {
		this.next = next;
	}

	public DLink getPrevious() {
		return previous;
	}

	public void setPrevious(DLink previous) {
		this.previous = previous;
	}

}
