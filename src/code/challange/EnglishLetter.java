//package code.challange;
//
//public class EnglishLetter {
//
//	private static String[] below10 = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
//			"nine" };
//	private static String[] below20 = new String[] { "ten", "eleven", "twelve", "therteen", "fourteen", "fifteen",
//			"sixteen", "seventeen", "eighteen", "ninteen" };
//	public static String[] below100 = new String[] { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty",
//			"seventy", "eighty", "ninety" };
//
//	public static void main(String[] args) {
//		int num = 100;
//		System.out.println(convertToEnglishLetter(num));
//	}
//
//	private static String convertToEnglishLetter(int num) {
//		String results = new String();
//		if (num == 0) {
//			return results = "Zero";
//		} else if (num < 10) {
//			return below10[num];
//		} else if (num < 20) {
//			return results = below20[num - 10];
//		} else if (num < 100) {
//			return below100[num / 10] + " " + below10[num % 10];
//		} else if (num < 1000) {
//			return results = convertToEnglishLetter(num / 100) + " " + "Hundred" + " "
//					+ convertToEnglishLetter(num % 100);
//
//		}
//		return results.trim();
//
//	};
//}

package code.challange;

public class EnglishLetter {

	private static String[] below10 = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine" };
	private static String[] below20 = new String[] { "ten", "eleven", "twelve", "therteen", "fourteen", "fifteen",
			"sixteen", "seventeen", "eighteen", "ninteen" };
	public static String[] below100 = new String[] { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty",
			"seventy", "eighty", "ninety" };

	public static void main(String[] args) {
		int num = 100;
		System.out.println(englishLetter(num));
		// englishLetter(9);
	}

	private static String englishLetter(int num) {
		String result = new String();
		if (num == 0)
			return "Zero";
		else if (num < 10)
			result = below10[num];
		else if (num < 20)
			result = below20[num - 10];
		else if (num < 100) {
			return result = below100[num / 10] + " " + englishLetter(num % 10);
		} else if (num < 1000) {
			return result = englishLetter(num / 100) + " Hundred " + englishLetter(num % 100);
		} else if (num < 1000000) {
			return result = englishLetter(num / 1000) + " Thousand " + englishLetter(num % 1000);
		} else if (num < 1000000000) {
			return result = englishLetter(num / 1000000) + " Million " + englishLetter(num % 1000000);
		} else {
			return result = englishLetter(num / 1000000000) + " Billion " + englishLetter(num % 1000000000);
		}

		return result.trim();
	}
}
