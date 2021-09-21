package code.challange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codechallange {
	public static void main(String[] args) {
		InputStreamReader f = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(f);
		Scanner s = new Scanner(System.in);
		System.out.println("Input arraylenght and digits to ReverseDigitsInArray");
		ReverseDigitsInArray(s);
//		System.out.println("input String to ReverseString");
//		 ReverseString(s);
//		 System.out.println("input a number to SumUpToGivenNumber");
//		 SumUpToGivenNumber(s);
//		 System.out.println("input a numbers to SumOfNumbers");
//		 SumOfNumbers(s);
//		 System.out.println("input palindraom number PalindromeNumber");
//		 PalindromeNumber(s);
//		 System.out.println("input digits to reverse ReverseNumbers");
//		 ReverseNumbers(s);
//		 System.out.println("input base and exp to  PowerOfNumber");
//		 PowerOfNumber(s);
	}

	private static void ReverseDigitsInArray(Scanner s) {
		int alen = s.nextInt();
		int[] arr = new int[alen];
		for (int i = 0; i < alen; i++) {
			arr[i] = s.nextInt();
		}
		// reverse the array
		int j = alen - 1; // pointing to last element in array
		// loop till half of input array
		for (int i = 0; i < alen / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[j - i];
			arr[j - i] = temp;
		}
		for (int i = 0; i < alen; i++) {
			System.out.print(arr[i]);
		}

	}

	private static void ReverseString(Scanner s) {
		String str = s.nextLine();
		int strl = str.length();
		String rev = "";
		for (int i = strl - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	private static void SumUpToGivenNumber(Scanner s) {
		int n = s.nextInt();
		int sum = 0;
		int k = 1;
		while (k <= n) {
			sum = sum + k;
			k++;
		}
		System.out.println(sum);
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
	public static void ReverseNumbers(Scanner s) {

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
