package sort;

public interface SortArray {

	public enum Implementation {
		BUBBLESORT, SELECTION, INSERTION
	}

	void setArray(int[] a);
	
	int[] getArray();
	
	void sort();
	
	void display();
	
	Implementation getImplementation();
	
}
