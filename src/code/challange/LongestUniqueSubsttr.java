package code.challange;

import java.util.HashMap;

public class LongestUniqueSubsttr {

//	public static void main(String args[]) {
//		double a = 12.123;
//		char b = 'e';
//
//		// prints the maximum of two numbers
//		System.out.println(Math.max(a, b));
//	}

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println("The input String is " + s);
		int length = longestUniqueSubsttr(s);
		System.out.println("The length of the longest non-repeating character substring is " + length);

	}

	private static int longestUniqueSubsttr(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		int start = 0;
		int max_length = 0;
		int end1 = 0;
		for (int end = 0; end < s.length(); end++) {

			if (map.containsKey(s.charAt(end))) {

				start = Math.max(start, map.get(s.charAt(end)) + 1);
			}
			map.put(s.charAt(end), end);
			max_length = Math.max(max_length, end - start + 1);
			end1 = end;
		}
		System.out.println(s.substring(start - 1, end1));
		return max_length;
	}

//	public static int longestUniqueSubsttr(String s) {
//
//		// Creating a set to store the last positions of occurrence
//		HashMap<Character, Integer> seen = new HashMap<>();
//		int maximum_length = 0;
//
//		// starting the initial point of window to index 0
//		int start = 0;
//		int end = 0;
//		for (end = 0; end < s.length(); end++) {
//			// Checking if we have already seen the element or not
//			if (seen.containsKey(s.charAt(end))) {
//				// If we have seen the number, move the start pointer
//				// to position after the last occurrence
//				start = Math.max(start, seen.get(s.charAt(end)) + 1);
//			}
//
//			// Updating the last seen value of the character
//			seen.put(s.charAt(end), end);
//			maximum_length = Math.max(maximum_length, end - start + 1);
//
//		}
//		System.out.println(s.substring(start - 1, end - 1));
//		return maximum_length;

//	}

}
