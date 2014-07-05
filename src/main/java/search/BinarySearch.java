package search;

import java.util.Arrays;

import sort.InsertionSortArray;
import sort.SortArray;

public class BinarySearch {

	private int[] a;

	public BinarySearch(int[] arrayToSearch, boolean isSorted) {
		if (isSorted) {
			// We can directly store it internally for searching purpose.
			a = arrayToSearch;
		} else {
			// Create a copy of the passed array and sort it.
			a = Arrays.copyOf(arrayToSearch, arrayToSearch.length);
			SortArray sortArray = new InsertionSortArray();
			sortArray.setArray(a);
			sortArray.sort();
		}
	}
	
	public int find(int n) {
		return find(n, 0, a.length - 1);
	}
	
	/**
	 * Find the number in the given array recursively.
	 */
	private int find(int n, int low, int high) {
		if (low > high) {
			// returns the insertion point -1
			return - (low) - 1;
		}
		int mid = (low + high) / 2;
		if (a[mid] == n)
			return mid;
		else if (n > a[mid])
			return find(n, mid + 1, high);
		else
			return find(n, low, mid - 1);
	}

}
