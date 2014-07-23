package recursion;

public class TriangularNumber {

	public static int triangle(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		return total;
	}

}
