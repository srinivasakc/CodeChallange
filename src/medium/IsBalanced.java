package medium;

import java.util.Stack;

public class IsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "{[( ljsdf;ljklj )]}";// true balanced
		String s2 = "{}[]()";// true balanced
		String s3 = "{[(])}";// false not balanced
		String s4 = "{}[](";// false not balanced
		System.out.println("s1 is balanced: " + isBalanced(s1));
		System.out.println("s2 is balanced: " + isBalanced(s2));
		System.out.println("s3 is balanced: " + isBalanced(s3));
		System.out.println("s4 is balanced: " + isBalanced(s4));

	}

	public static boolean isBalanced(String s) {
		char[] cArray = s.toCharArray();

		Stack<Character> st = new Stack<>();

		for (char c : cArray) {
			if (c == '{' || c == '[' || c == '(') {
				st.push(c);
			} else if (c == '}') {

				if (!(st.pop() == '{')) {
					return false;
				}

			} else if (c == ']') {
				if (!(st.pop() == '[')) {
					return false;
				}

			} else if (c == ')') {
				if (!(st.pop() == '(')) {
					return false;
				}
			}
		}
		if (!st.isEmpty()) {
			return false;
		}
		return true;
	}

}
