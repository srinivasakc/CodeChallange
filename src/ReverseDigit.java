//Write a program to reverse digits of a number

class ReverseDigit {

	public static void main(String[] args) {
		int d = reverseDigits(2454543);
		System.out.println(d);
	}

	static int reverseDigits(int n) {
		int rev = 0;
		while (n > 0) {
			rev = (rev * 10) + (n % 10);
			n = n / 10;
		}
		return rev;
	}
}
