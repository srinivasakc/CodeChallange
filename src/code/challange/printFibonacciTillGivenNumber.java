package code.challange;

class printFibonacciTillGivenNumber {
	public static void fib(int n) {
		int a = 0, b = 0, sum = 1;

		while (b <= n) {
			a = b;
			b = sum;
			sum = a + b;
			System.out.print(a + ", ");
		}
	}

	public static void main(String args[]) {
		int n = 9;
		fib(10000);
	}
}
