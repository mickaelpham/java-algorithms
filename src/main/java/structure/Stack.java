package structure;

public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		maxSize = size;
		stackArray = new long[size];
		top = -1; // no items yet
	}
	
	public void push(long el) {
		if (isFull()) return;
		stackArray[++top] = el;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public long peek() {
		if (top >= 0)
			return stackArray[top];
		else
			return 0;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}

}
