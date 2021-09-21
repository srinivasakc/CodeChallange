package code.challange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codechallange {
	public static void main(String[] args) {
		InputStreamReader f = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(f);
		Scanner s = new Scanner(System.in);

		SumUpToGivenNumber(s);
		// SumOfNumbers(s);
		// PalindromeNumber(s);
		// ReverseNumber(s);
		// PowerOfNumber(s);
	}

	private static void SumUpToGivenNumber(Scanner s) {

	}

	private static void SumOfNumbers(Scanner s) {
		int n = s.nextInt();
		int sum = 0;
		while (n != 0) {
			int remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		System.out.println(sum);
	}

	public static void PalindromeNumber(Scanner s) {
		int n = s.nextInt();
		int rev = 0;
		int m = n;
		while (n != 0) {
			int remainder = n % 10;
			rev = rev * 10 + remainder;
			n = n / 10;
		}
		if (m == rev) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

//reverser nubmer
	public static void ReverseNumber(Scanner s) {

		// reverser nubmer
		int n = s.nextInt();
		int rev = 0;
		while (n != 0) {
			int remainder = n % 10;
			rev = rev * 10 + remainder;
			n = n / 10;
		}
		System.out.println(rev);

	}

// power of number
	public static void PowerOfNumber(Scanner s) {
		// pow of n e.g 2 pow 3 base 2 exponent 3 2*2*2=8
		int base = s.nextInt();
		int exp = s.nextInt();
		int pow = 1;
		while (exp != 0) {
			pow = pow * base;
			exp--;
		}
		System.out.println(pow);
	}
}
