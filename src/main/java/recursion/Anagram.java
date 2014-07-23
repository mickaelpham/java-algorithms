package recursion;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

	public static String[] doAnagram(String word) {
		List<String> results = new ArrayList<String>();
		anagramRecursion("", word, results);
		return results.toArray(new String[results.size()]);
	}

	public static void anagramRecursion(String prefix, String remaining,
			List<String> results) {
		if (remaining.length() == 1) {
			results.add(prefix + remaining);
		} else {
			for (int i = 0; i < remaining.length(); i++) {
				anagramRecursion(prefix + remaining.charAt(0),
						remaining.substring(1, remaining.length()), results);
				remaining = rotate(remaining);
			}
		}
	}

	public static String rotate(String word) {
		if (word.length() <= 1)
			return word;
		else
			return word.substring(1, word.length()) + word.charAt(0);
	}

}
