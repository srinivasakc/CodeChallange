package easy;

public class SumOfAllDigitInPhoneNumber {

	public static void main(String[] args) {
		String num = "4702654096";
		System.out.println(phoneNumberSum(num));

	}

	private static int phoneNumberSum(String num) {
		int sum = 0;
		int len = num.length();
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(num.charAt(i))) {
				sum = sum + Character.getNumericValue(num.charAt(i));
			}
		}
		return sum;
	}

}
