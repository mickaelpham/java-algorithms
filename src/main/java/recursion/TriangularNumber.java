package recursion;

public class TriangularNumber {

	public static int triangle(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		return total;
	}

	public static int triangleRecursion(int n) {
		if (n == 1)
			return 1;
		else
			return n + triangleRecursion(n - 1);
	}

	public static int triangleMath(int n) {
		return (int) ((Math.pow(n, 2) + n) / 2);
	}

}
