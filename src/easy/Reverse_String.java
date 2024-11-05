package easy;

class Revese_String {
	public static void main(String[] args) {
		System.out.println(revStringEfficentAlgorithm("elppa")); // apple
		System.out.println(reverse_String("apple")); // elppa
		System.out.println(reverse_String("John")); // nhoJ
		System.out.println(reverse_String("phone")); // enohp
		System.out.println(reverse_String_UsingStringBuilder("1234567")); // 7654321

	}

	public static String revStringEfficentAlgorithm(String str) {
		char[] cArray = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			char temp = cArray[start];
			cArray[start] = cArray[end];
			cArray[end] = temp;
			start++;
			end--;
		}
		return new String(cArray);
	}

	public static String reverse_String(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev;

	}

	public static String reverse_String_UsingStringBuilder(String str) {
		StringBuilder rev = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}

		return rev.toString();
	}
}

/*
 * Explanation: Convert to char array: The string is converted to a char array,
 * which allows efficient manipulation of individual characters. Two-pointer
 * approach: Two pointers, left and right, are used to traverse the array from
 * both ends. Swap characters: Characters at the left and right positions are
 * swapped, effectively reversing the string. Loop until the middle: The loop
 * continues until the pointers meet in the middle of the string. Create a new
 * string: A new string is created from the reversed character array. Time
 * Complexity: O(n), where n is the length of the string. Space Complexity:
 * O(n), as a new character array is created.
 */
