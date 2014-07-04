package stucture;

public class StackChar {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackChar(int size) {
		maxSize = size;
		stackArray = new char[size];
		top = -1; // no items yet
	}
	
	public void push(char el) {
		if (isFull()) return;
		stackArray[++top] = el;
	}
	
	public char pop() {
		return stackArray[top--];
	}
	
	public char peek() {
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
