package structure.linked;

public class DLink {

	private long data;
	private DLink next;
	private DLink previous;

	public DLink(long data) {
		setData(data);
		setNext(null);
		setPrevious(null);
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
