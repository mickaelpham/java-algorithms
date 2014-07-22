package structure;

import java.io.StringWriter;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import structure.Stack;
import structure.StackChar;

public class StackTest {

	private static final int MAX_SIZE = 100;
	private static final int MAX_RANDOM = 1000;

	@Test
	public void simpleStackTest() {
		Random rn = new Random();
		Stack stack = new Stack(MAX_SIZE);
		long n = Long.valueOf(rn.nextInt(MAX_RANDOM));
		stack.push(n);
		Assert.assertEquals(n, stack.peek());
		Assert.assertEquals(n, stack.pop());
	}
	
	@Test
	public void testReversingWord() {
		String wordToReverse = "carpooling";
		StackChar stack = new StackChar(wordToReverse.length());
		for (char c : wordToReverse.toCharArray()) {
			stack.push(c);
		}
		StringWriter sw = new StringWriter();
		while (!stack.isEmpty()) {
			sw.append(stack.pop());
		}
		String reversed = sw.toString();
		Assert.assertEquals("gnilooprac", reversed);
	}
	
	@Test
	public void testReversingSentence() {
		String sentenceToReverse = "When we will all be doomed for eternity!";
		// Split the sentence into words.
		String[] words = sentenceToReverse.split(" ");		
		String[] reversedWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			String w = words[i];
			StackChar stack = new StackChar(w.length());
			for (char c : w.toCharArray()) {
				stack.push(c);
			}
			StringWriter sw = new StringWriter();
			while (!stack.isEmpty()) {
				sw.append(stack.pop());
			}
			reversedWords[i] = sw.toString();
		}
		// Write the reversed sentence.
		String reversed = "";
		for (String w : reversedWords) {
			if (reversed.isEmpty())
				reversed += w;
			else
				reversed += " " + w;
		}
		Assert.assertEquals("nehW ew lliw lla eb demood rof !ytinrete",
				reversed);
	}

}
