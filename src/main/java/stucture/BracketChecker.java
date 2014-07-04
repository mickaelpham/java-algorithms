package stucture;

public class BracketChecker {

	private String input;
	private StackChar stack;
	private final static String OPENING_CHARS = "({[";
	private final static String CLOSING_CHARS = ")}]";
	
	public BracketChecker(String input) {
		this.input = input;
		stack = new StackChar(input.length());
		
	}
	
	public boolean check() {
		for (char c : input.toCharArray()) {
			if (OPENING_CHARS.indexOf(String.valueOf(c)) != -1) {
				stack.push(c);
			} else if (CLOSING_CHARS.indexOf(String.valueOf(c)) != -1
					&& !arePaired(stack.pop(), c)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean arePaired(char a, char b) {
		int openingIndex = OPENING_CHARS.indexOf(String.valueOf(a));
		int closingIndex = CLOSING_CHARS.indexOf(String.valueOf(b));
		return openingIndex == closingIndex;
	}
	
	
}
