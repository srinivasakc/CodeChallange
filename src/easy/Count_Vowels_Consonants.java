package easy;

public class Count_Vowels_Consonants {

	public static void main(String[] args) {

		String str = "Automation";

		int[] count = CountVowelsConsonants(str);
		System.out.println("Vowels count: " + count[0]);
		System.out.println("consonants count: " + count[1]);

	}

	public static int[] CountVowelsConsonants(String str) {
		int vowelsCount = 0;
		int consonantsCount = 0;
		String vowels = "aeiouAEIOU";

		for (char c : str.toCharArray()) {
			if (vowels.indexOf(c) != -1) {
				vowelsCount++;
				System.out.println("Vowel- " + c);
			} else if (Character.isLetter(c)) {
				System.out.println("Consonants- " + c);
				consonantsCount++;
			}

		}

		return new int[] { vowelsCount, consonantsCount };
	}

}
//Explanation:
// vowels.indexOf(ch) != -1: Checks if the character is a vowel.
// Character.isLetter(ch): Ensures that only letters are counted as consonants.