import java.util.Scanner;

public class PrintOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		printOddNumbers(N);

	}

	static void printOddNumbers(int n) {
		int i = 1;

		while (i <= n) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
			}
			i++;
		}
	}
}
