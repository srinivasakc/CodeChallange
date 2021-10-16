package code.challange;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci
		// f(3)-- 011235813
		System.out.print(fib(6));
	}

	public static int fib(int n) {

		int first = 0;
		int second = 1;
		int k = 0;
		int fib = 0;
		while (k < n) {
			// System.out.print(fib + " ");
			fib = first + second;
			first = second;
			second = fib;
			k++;
		}

		return fib;

	}
}
