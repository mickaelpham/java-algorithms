package sort;

public class InsertionSortArray extends BasicSortArray {

	@Override
	public void sort() {
		int in, out, temp;
		for (out = 1; out < a.length; out++) {
			temp = a[out];
			in = out;
			while (in > 0 && a[in-1] >= temp) {
				a[in] = a[in-1];
				in--;
			}
			a[in] = temp;
		}
	}

	@Override
	public Implementation getImplementation() {
		return Implementation.INSERTION;
	}

}
