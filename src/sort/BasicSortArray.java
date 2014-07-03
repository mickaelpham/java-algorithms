package sort;

public abstract class BasicSortArray implements SortArray {

	protected int[] a;

	protected void swap(int x, int y) {
		if (a[x] == a[y]) return;
		a[x] = a[x] + a[y];
		a[y] = a[x] - a[y];
		a[x] = a[x] - a[y];
	}
	
	@Override
	public void setArray(int[] a) {
		this.a = a;
	}

	@Override
	public int[] getArray() {
		return a;
	}
	
	@Override
	public void display() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

}
