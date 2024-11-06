package easy;

class Reverse_words {

	public static void main(String[] args) {
		System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
		System.out.println(revWords("I am John Doe")); // Doe John am I
		System.out.println(revWords("orange")); // orange

	}

	public static String revWords(String str) {
		StringBuilder revString = new StringBuilder();

		String[] words = str.split("\\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			revString.append(words[i]).append(" ");
		}

		return revString.toString().trim();
	}

}
