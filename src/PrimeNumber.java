import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(isPrimeNumber(N));

	}

	static int isPrimeNumber(int N) {

		// code here
		if (N == 0 || N == 1) {
			return 0;
		}

		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) {// divided by each numbers till the 1/2(half) of the N
				return 0;
			}
		}
		return 1;
	}

}
