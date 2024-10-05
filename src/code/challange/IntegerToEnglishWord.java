package code.challange;

public class IntegerToEnglishWord {

	private final String[] belowten = new String[] { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };
	private final String[] belowtwenty = new String[] { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
			"Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	private final String[] belowhundred = new String[] { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
			"Seventy", "Eighty", "Ninety" };

	public static void main(String[] args) {
		int num = 123240;
		IntegerToEnglishWord t = new IntegerToEnglishWord();
		System.out.println(t.numbersToWord(num));

	}

	private String numbersToWord(int num) {

		if (num == 0) {
			return "Zero";
		}
		return EnglishLetter(num);
	}

	private String EnglishLetter(int num) {
		String result = new String();
		if (num < 10) {
			result = belowten[num];
		} else if (num < 20) {
			result = belowtwenty[num - 10];
		} else if (num < 100) {
			result = belowhundred[num / 10] + " " + EnglishLetter(num % 10);
		} else if (num < 1000) {
			result = EnglishLetter(num / 100) + " Hundred " + EnglishLetter(num % 100);
		} else if (num < 1000000) {
			result = EnglishLetter(num / 1000) + " Thousand " + EnglishLetter(num % 1000);
		} else if (num < 1000000000) {
			result = EnglishLetter(num / 1000000) + " Million " + EnglishLetter(num % 1000000);
		} else {
			result = EnglishLetter(num / 1000000000) + " Billion " + EnglishLetter(num % 1000000000);
		}
		return result.trim();
	}

}
