
// Java program to reverse a String

class ReverseAString {
	static char[] reverseString(char s[]) {
		int start = 0;
		for (int i = 0; i < s.length - 1; i++) {
			if (s[i] == '.') {
				reverseWords(s, start, i - 1);
				start = i + 1;
			}
		}
		// reverse last word
		reverseWords(s, start, s.length - 1);
		// reverse entire string
		reverseWords(s, 0, s.length - 1);
		return s;
	}

	static char[] reverseWords(char[] s, int start, int end) {
		char temp;
		while (start <= end) {
			temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		return s;
	}

// Driver Code
	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		char c[] = reverseString(s.toCharArray());
		System.out.println(String.valueOf(c));

	}
}