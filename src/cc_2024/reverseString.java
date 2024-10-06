package cc_2024;

import java.io.IOException;

public class reverseString {

	public static void main(String[] args) throws IOException {

		String str = "Srinivasa";
		System.out.println(str);

		String rev = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
	}

}
