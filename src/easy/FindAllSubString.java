package easy;

public class FindAllSubString {

	public static void main(String[] args) {
		String str = "abc";
		findAllSubstring(str);

	}

	public static void findAllSubstring(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}

		}

	}
}
