package recursion;

public class Anagram {

	public static String[] doAnagram(String word) {
		if (word.length() == 1)
			return null;
		else
			return null;
	}

	public static String rotate(String word) {
		if (word.length() <= 1)
			return word;
		else
			return word.substring(1, word.length()) + word.charAt(0);
	}

}
