package code.challange;

public class LongestPalinSubstring {

	static void printSubStr(String str, int low, int high) {
		System.out.println(str.substring(low, high));
	}

	// Driver program to test above functions
	public static void main(String[] args) {

		String str = "babad";
		System.out.println("Length is: " + longestPalSubstr(str));
	}

	private static int longestPalSubstr(String str) {
		int maxlength = 1;
		int start = 0;
		int len = str.length();
		boolean[][] table = new boolean[len][len];

		for (int i = 0; i < len; i++) {
			table[i][i] = true;
			start = i;
			maxlength = 1;
		}
		for (int i = 0; i < len - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				table[i][i + 1] = true;
				start = i;
				maxlength = 2;
			}
		}
		for (int k = 3; k < len; k++) {

			for (int i = 0; i < len - k + 1; i++) {
				int j = i + k - 1;
				if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
					table[i][j] = true;
					start = i;
					if (k > maxlength) {
						start = i;
						maxlength = k;
					}
				}
			}

		}

		System.out.println("Longest palindrome is: ");
		printSubStr(str, start, start + maxlength);
		return maxlength;
	}

//	private static int longestPalSubstr(String s) {
//		int maxlength = 1;
//		int start = 0;
//		int n = s.length();
//		boolean[][] table = new boolean[n][n];
//
//		// all the string of length 1 are palindrome
//		for (int i = 0; i < n; i++) {
//			table[i][i] = true;
//		}
//		// check the string of length 2 is palindrome
//		for (int i = 0; i < n - 1; i++) {
//			if (s.charAt(i) == s.charAt(i + 1)) {
//				table[i][i + 1] = true;
//				start = i;
//				maxlength = 2;
//			}
//		}
//		// check for length of k string greater then 2
//		for (int k = 3; k < n; k++) {
//
//			for (int i = 0; i < n - k + 1; i++) {
//				int j = i + k - 1;
//
//				if (table[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
//					table[i][j] = true;
//					if (k > maxlength) {
//						start = i;
//						maxlength = k;
//					}
//				}
//			}
//		}
//		System.out.print("Longest palindrome substring is; ");
//		printSubStr(s, start, start + maxlength);
//		return maxlength;
//	}
}
