package stucture;

public class PriorityQueue {

	private long[] a;
	private int nElems;
	private int maxSize;
	private int rear;
	private int front;
	
	public PriorityQueue(int size) {
		maxSize = size;
		a = new long[size];
		nElems = 0;
		rear = -1;
		front = 0;
	}
	
	public void insert(long e) {
		if (isFull()) {
			return;
		} else if (isEmpty()) {
			a[++rear] = e;
		} else {
			int position = findInsertionIndex(e);
			insertAt(position, e);
		}
		nElems++;
	}
	
	private int findInsertionIndex(long e) {
		int i = front;
		do {
			if (i == maxSize - 1)
				i = -1;
			i++;
		} while (i != rear && a[i] <= e);
		return i;
	}
	
	private void insertAt(int index, long e) {
		if (rear <= maxSize - 1 && index == rear + 1) {
			if (rear == maxSize - 1)
				rear = -1;
			a[++rear] = e;
		} else {
			long tmp = a[index];
			a[index] = e;
			if (index == maxSize - 1)
				index = -1;
			insertAt(index + 1, tmp);
		}
	}
	
	public long remove() {
		if (isEmpty())
			return -1;
		long temp = a[front++];
		if (front == maxSize)
			front = 0;
		nElems--;
		return temp;
	}
	
	public long peek() {
		if (isEmpty()) return -1;
		return a[front];
	}
	
	public int size() {
		return nElems;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}

}
