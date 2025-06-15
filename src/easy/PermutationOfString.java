package easy;

public class PermutationOfString {

	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str, "");

	}

	private static void printPermutation(String str, String result) {
		// If string is empty
		if (str.length() == 0) {
			System.out.println(result);// print the results
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			// ith character of str
			char c = str.charAt(i);
			// Rest of the string after excluding the ith character
			String reset = str.substring(0, i) + str.substring(i + 1);
			// Recursive call
			printPermutation(reset, result + c);

		}

	}

}
