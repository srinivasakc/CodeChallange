import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number: \n");
		int N = sc.nextInt();
		System.out.println(isPrimeNumber(N));

	}

	static String isPrimeNumber(int N) {

		// code here
		if (N == 0 || N == 1) {
			return "This is not a prime number";
		}

		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) {// divided by each numbers till the 1/2(half) of the N
				return "This is not a prime number";
			}
		}
		return "This is a prime number";
	}

}
