package code.challange;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci
		// f(3)-- 011235813
		System.out.print(fib(1000));
		System.out.print(fibrec(fibrec(3)));
	}

	public static int fib(int n) {

		int first = 0;
		int second = 1;
		int k = 0;
		int fib = 0;
		while (k < n) {
			System.out.println(fib + " ");
			fib = first + second;
			first = second;
			second = fib;
			k++;
		}

		return fib;

	}

	static int fibrec(int n) {
		if (n <= 1)
			return n;
		return fibrec(n - 1) + fib(n - 2);
	}
}
