package util;

import java.util.Random;

public class Tool {

	public static int[] generateRandomArray(int length, int maxRandom) {
		if (length <= 0) return null;
		Random rn = new Random();
		int[] a = new int[length];
		for (int i = 0; i < length; i++) {
			a[i] = rn.nextInt(maxRandom);
		}
		return a;
	}
}
