package easy;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "Silent";

		System.out.println(isAnagram(str1, str2));

	}

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);

	}

}
//Explanation:
// if (str1.length() != str2.length()): Checks if both strings have the same length.
// Arrays.sort(arr1): Sorts the character array of the first string.
// Arrays.equals(arr1, arr2): Compares the sorted character arrays of both strings.