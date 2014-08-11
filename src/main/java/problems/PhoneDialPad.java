package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * You are given a function that can tell you if a String is a valid English
 * word or not. Given a number, corresponding to a dialpad input, write a method
 * that can list all the word possibles with it.
 * 
 * E.g. the entry "2225" can be translated as "BACK" on the dialpad.
 * 
 * Hint: use recursion.
 */
public class PhoneDialPad {

  // String array used to retrieve number to letters equivalent.
  private String[] letters = { "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO",
      "PQRS", "TUV", "WXYZ" };

  private String input;

  private List<String> words;

  public PhoneDialPad(String userInput) {
    input = userInput;
  }

  public List<String> getWords() {
    if (words == null)
      words = getAllWords("", input);
    return words;
  }

  public int getNumberOfPossibleWords() {
    if (words == null)
      words = getAllWords("", input);
    return words.size();
  }

  private List<String> getAllWords(String prefix, String remaining) {
    int letterIndex = Integer.valueOf(remaining.substring(0, 1));
    List<String> results = new LinkedList<String>();
    if (remaining.length() == 1)
      for (char c : letters[letterIndex].toCharArray())
        results.add(prefix + c);
    else
      for (char c : letters[letterIndex].toCharArray())
        results.addAll(getAllWords(prefix + c, remaining.substring(1)));
    return results;
  }

}
