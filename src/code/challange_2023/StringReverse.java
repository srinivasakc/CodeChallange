package code.challange_2023;

public class StringReverse {
	public static void main(String args[]) {
		System.out.println(strRev("Apple"));
	}

	public static String strRev(String str) {
		String rev = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}

		return rev;
	}
}
