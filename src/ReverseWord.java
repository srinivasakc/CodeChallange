
public class ReverseWord {
	// Complete the function
	// str: input string
	public static String reverseWord(String str) {
		// Reverse the string str
		int l = str.length();
		String rev = "";
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {

		System.out.println(reverseWord("Geeksco"));
	}
}