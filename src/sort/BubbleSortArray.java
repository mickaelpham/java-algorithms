package sort;

public class BubbleSortArray extends BasicSortArray {

	@Override
	public void sort() {
		for (int out = a.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (a[in] > a[in+1]) {
					swap(in, in+1);
				}
			}
		}
	}
	
	@Override
	public Implementation getImplementation() {
		return Implementation.BUBBLESORT;
	}

}
