package easy;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int n = 10;
		System.out.print(first + " " + second);
		for (int i = 2; i < n; i++) {
			int sum = first + second;
			System.out.print(" " + sum);
			first = second;
			second = sum;
		}

	}

}
