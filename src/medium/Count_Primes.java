package medium;

import java.util.Arrays;

public class Count_Primes {

	public static void main(String[] args) {
		System.out.println(countAndPrintPrimes(10));
	}

	// Given an integer n, return the number of prime numbers that are strictly less
	// than n.
	public static int countAndPrintPrimes(int n) {
		int count = 0;

		if (n < 2) {
			return 0;
		}
		boolean[] isPrime = new boolean[n];

		Arrays.fill(isPrime, true);

		for (int i = 2; i < n; i++) {
			if (isPrime[i]) {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						isPrime[i] = false;
						break;
					}
				}
			}
		}

		for (int i = 2; i < n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.print("\n");
		return count;
	}

}
//Given an integer n, return the number of prime numbers that are strictly less than n.
//
//		 
//
//Example 1:
//
//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//Example 2:
//
//Input: n = 0
//Output: 0
//Example 3:
//
//Input: n = 1
//Output: 0