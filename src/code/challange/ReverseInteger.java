package code.challange;

public class ReverseInteger {

	public static void main(String[] args) {
		int n = 123456789;
		System.out.println("Given integer: " + n);
		int rev = 0;
		while (n > 0) {
			int remainder = n % 10;
			rev = rev * 10 + remainder;
			n = n / 10;

		}

		System.err.println("Reversed Integer: " + rev);
	}

}
