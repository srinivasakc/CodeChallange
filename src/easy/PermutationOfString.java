package easy;

public class PermutationOfString {

	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str, "");

	}

	private static void printPermutation(String str, String result) {
		// TODO Auto-generated method stub

		if (str.length() == 0) {
			System.out.println(result);// print the results
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String reset = str.substring(0, i) + str.substring(i + 1);
			printPermutation(reset, result + c);

		}

	}
}
