package easy;

public class OccuranceOfGivenCharacter {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char c = 'k';
		int occurance = getOccurrenceOfgivenCharacter(str, c);
		System.out.println(occurance);

	}

	private static int getOccurrenceOfgivenCharacter(String str, char c) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				cnt++;
			}
		}

		return cnt;
	}

}
