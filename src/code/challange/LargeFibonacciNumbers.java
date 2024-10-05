package code.challange;

import java.math.BigInteger;

public class LargeFibonacciNumbers {

	public static void main(String[] args) {

		fib(1000);
	}

	private static void fib(int n) {
		BigInteger f = BigInteger.valueOf(0);
		BigInteger s = BigInteger.valueOf(1);
		BigInteger fib = BigInteger.valueOf(0);

		int k = 0;
		while (k <= n) {
			fib = f.add(s);
			f = s;
			s = fib;
			System.out.print(fib + ",");
		}

	}

}
