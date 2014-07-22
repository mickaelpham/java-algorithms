package structure;

public class PriorityQueue {

	private long[] a;
	private int nElems;
	private int maxSize;
	
	public PriorityQueue(int size) {
		maxSize = size;
		a = new long[size];
		nElems = 0;
	}
	
	public void insert(long e) {
		int j;
		
		if (nElems == 0) {
			a[nElems++] = e;
		} else {
			for (j = nElems - 1; j >= 0; j--) {
				if (e > a[j]) {
					a[j+1] = a[j];
				} else {
					break;
				}
			}
			a[j+1] = e;
			nElems++;
		}
		
	}
	
	public long remove() {
		return a[--nElems];
	}
	
	public long peek() {
		return a[nElems-1];
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
