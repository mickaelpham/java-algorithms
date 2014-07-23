package recursion;

public class TriangularNumber {

	public static int triangle(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		return total;
	}

	public static int triangleRecursion(int n, int total) {
		if (n > 0)
			return triangleRecursion(n - 1, total + n);
		else
			return total;
	}

}
