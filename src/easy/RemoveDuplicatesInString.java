package easy;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String str = "Automation";
		String result = removeDuplicate(str);
		System.out.println(result);

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

}
