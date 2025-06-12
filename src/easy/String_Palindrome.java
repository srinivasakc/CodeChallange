package easy;

public class String_Palindrome {

	public static void main(String[] args) {
		String str = "madam";

		System.out.println(isStringPalindrome(str));

	}

	public static boolean isStringPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}

		return true;

	}
}

//Explanation:
// while (left < right): Loops through the string comparing characters from the start and end.
// str.charAt(left) != str.charAt(right): If characters don't match, it's not a palindrome.
