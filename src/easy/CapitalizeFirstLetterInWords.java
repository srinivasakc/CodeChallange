package easy;

public class CapitalizeFirstLetterInWords {

	public static void main(String[] args) {

		String str = "quality assurance testing";
		String result = capitalizeWords(str);
		System.out.println("Capitalised words: " + result);
	}

	private static String capitalizeWords(String str) {
		StringBuilder sb = new StringBuilder();
		String[] words = str.split("\\s+");
		for (String word : words) {
			sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}

		return sb.toString();
	}

}
