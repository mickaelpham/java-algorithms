package util;

import java.util.Random;

import structure.StackChar;

public class Tool {

	private static final int MAX_ASCII_CHARS = 256;

	public static int[] generateRandomArray(int length, int maxRandom) {
		if (length <= 0)
			return null;
		Random rn = new Random();
		int[] a = new int[length];
		for (int i = 0; i < length; i++)
			a[i] = rn.nextInt(maxRandom);
		return a;
	}

	public static boolean containsUniqueChars(String input) {
		if (input.length() > MAX_ASCII_CHARS)
			return false;
		boolean[] charSet = new boolean[MAX_ASCII_CHARS];
		for (int i = 0; i < input.length(); i++) {
			int value = input.charAt(i);
			if (charSet[value])
				return false;
			else
				charSet[value] = true;
		}
		return true;
	}
	
	public static boolean isPermutation(String input, String compareTo) {
		if (input.length() != compareTo.length())
			return false;
		StackChar stack = new StackChar(input.length());
		for (char c : input.toCharArray())
			stack.push(c);
		for (char c : compareTo.toCharArray()) {
			if (c != stack.pop())
				return false;
		}
		return true;
	}
	
	public static String join(String[] a, String separator) {
		if (a.length == 1)
			return a[0];
		StringBuilder sb = new StringBuilder();
		sb.append(a[0]);
		for (int i = 1; i < a.length; i++)
			sb.append(separator + a[i]);
		return sb.toString();
	}
}
