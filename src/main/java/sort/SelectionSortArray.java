package sort;

public class SelectionSortArray extends BasicSortArray {

	@Override
	public void sort() {
		int in, out, min;
		for (out = 0; out < a.length - 1; out++) {
			min = out;
			for (in = out; in < a.length; in++) {
				if (a[in] < a[min]) {
					min = in;
				}
			}
			swap(out, min);
		}
	}
	
	@Override
	public Implementation getImplementation() {
		return Implementation.SELECTION;
	}

}
