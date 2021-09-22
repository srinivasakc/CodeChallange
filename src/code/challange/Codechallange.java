package code.challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Codechallange {
	public static void main(String[] args) throws IOException {
		InputStreamReader f = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(f);
		Scanner s = new Scanner(System.in);

		Fibonacci(s);

		MinInArray(s);
		// System.out.println("6. Max/min number from an array");
		MaxInArray(s);
//		System.out.println("4. String palindrome. A palindrome " + "is a word, phrase, number,"
//				+ " or sequence of words that" + " reads the same backward as forward.");
//		System.out.println(StringPalindrome(s));

//		System.out.println("3. Reverse words. Write a method that" + " will take a string as an argument. "
//				+ "The method will reverse the position" + " of words and return it.");
//		ReverseWords(b);
//		System.out.println("Input arraylenght and digits to ReverseDigitsInArray");
//		ReverseDigitsInArray(s);
//		System.out.println("input String to ReverseString");
//		 ReverseString(s);
//		 System.out.println("input a number to SumUpToGivenNumber");
//		 SumUpToGivenNumber(s);
//		 System.out.println("input a numbers to SumOfNumbers");
//		 SumOfNumbers(s);
//		 System.out.println("input palindraom number PalindromeNumber");
//		 NumberPalindrome(s);
//		 System.out.println("input digits to reverse ReverseNumbers");
//		 ReverseNumbers(s);
//		 System.out.println("input base and exp to  PowerOfNumber");
//		 PowerOfNumber(s);
	}

	private static void Fibonacci(Scanner s) {
		int n = s.nextInt(); // 0112358
		int first = 0;
		int second = 1;
		int sum = 0;
		int k = 0;
		while (k <= n) {
			sum = first + second;
			System.out.println(first + " ");
			sum = first + second;
			first = second;
			second = sum;
			k++;
		}

	}

	public int SecMax_In_NumberArray(Scanner s) {
		int ln = s.nextInt();
		int arry[] = new int[ln];

		int k = 0;
		while (k < ln) {
			arry[k] = s.nextInt();
			k++;
		}
		// sort an array
		Arrays.sort(arry);

		// return one before last. Array is soreted from smallest to biggest
		return arry[arry.length - 2];
	}

	public int SecMin_In_NumberArray(Scanner s) {
		int ln = s.nextInt();
		int arry[] = new int[ln];

		int k = 0;
		while (k < ln) {
			arry[k] = s.nextInt();
			k++;
		}
		// sort an array
		Arrays.sort(arry);

		// return second element. Array is soreted from smallest to biggest
		return arry[1];
	}

	private static void MinInArray(Scanner s) {
		int ln = s.nextInt();
		int arry[] = new int[ln];

		int k = 0;
		while (k < ln) {
			arry[k] = s.nextInt();
			k++;
		}
		int min = arry[0];

		for (int i = 0; i < ln; i++) {
			if (min > arry[i]) {
				min = arry[i];
			}
		}
		System.out.println(min);
	}

	private static void MaxInArray(Scanner s) {
		int al = s.nextInt();
		int arry[] = new int[al];
		int k = 0;
		while (k < al) {
			arry[k] = s.nextInt();
			k++;
		}
		int max = arry[0];
		for (int i = 0; i < al; i++) {
			if (max < arry[i]) {
				max = arry[i];
			}
		}
		System.err.println(max);
	}

	private static boolean StringPalindrome(Scanner s) {
		String strP = s.nextLine();
		int ln = strP.length();
		int j = ln - 1;
		for (int i = 0; i < ln / 2; i++) {
			if (strP.charAt(i) != strP.charAt(j - i)) {
				return false;
			}
		}
		return true;
	}

	// revWords("apple banana kiwi") -> "kiwi banana apple"
	// revWords("I am John Doe") -> "Doe John am I"
	// revWords("orange") -> "orange"
	private static void ReverseWords(BufferedReader b) throws IOException {
		String strWords = b.readLine();
		String[] aWords = strWords.split(" ");
		String reversedWord = "";
		StringBuilder reversedWords = new StringBuilder();
		for (int i = aWords.length - 1; i >= 0; i--) {
			reversedWord = reversedWord + " " + aWords[i];
		}

		System.out.println(reversedWord.trim());
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

	public static void NumberPalindrome(Scanner s) {
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
