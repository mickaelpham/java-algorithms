package stucture;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int rear;
	private int front;
	private int nElems;

	public Queue(int size) {
		maxSize = size;
		queueArray = new long[size];
		rear = -1;
		front = 0;
		nElems = 0;
	}
	
	public void insert(long el) {
		if (isFull()) return;
		// Deal with wrap around (circular queue).
		if (rear == maxSize - 1)
			rear = -1;
		queueArray[++rear] = el;
		nElems++;
	}
	
	public long remove() {
		if (isEmpty()) return -1;
		long temp = queueArray[front++];
		// Deal with wrap around.
		if (front == maxSize)
			front = 0;
		nElems--;
		return temp;
	}
	
	public long peek() {
		if (nElems == 0) return -1;
		return queueArray[front];
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public int size() {
		return nElems;
	}
	

}
