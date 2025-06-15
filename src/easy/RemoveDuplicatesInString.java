package easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String str = "Automation";
		String result = removeDuplicate(str);
		System.out.println(result);
		System.out.println(removeDup("hello")); // helo
		System.out.println(removeDup("apple")); // aple
		System.out.println(removeDup("aaaaaa")); // a
		System.out.println(removeDup("abc")); // abc

	}

	private static String removeDuplicate(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (sb.indexOf(String.valueOf(ch)) == -1) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	// or do it with Set
	public static String removeDupWithSet(String str) {
		StringBuilder strNoDup = new StringBuilder();

		// convert str to char[]
		char[] letters = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();

		// add each letter to set. It will remove duplicates - Set does not allow
		// duplicates
		for (char ch : letters) {
			set.add(ch);
		}

		// put back to String from Set
		for (Character ch : set) {
			strNoDup.append(ch);
		}

		return strNoDup.toString();
	}

	public static String removeDup(String str) {
		StringBuilder strNoDup = new StringBuilder();

		// loop over string and get each char
		for (char ch : str.toCharArray()) {
			// if strNoDup does not contain char then add to it
			if (!strNoDup.toString().contains(String.valueOf(ch))) {
				strNoDup.append(ch);
			}
		}

		return strNoDup.toString();
	}

}
