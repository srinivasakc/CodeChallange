
public class SumOFDigits {
	public static void main(String[] args) {
		int N = 123134;
		SumOFDigits s = new SumOFDigits();
		System.out.println(s.sumOfDigits(N));
	}

	int sumOfDigits(int N) {
		// code here
		int sum = 0;
		if (N / 10 == 0) {
			return 0;
		}
		while (N > 0) {
			sum = sum + N % 10;
			System.out.println(sum);
			N = N / 10;
		}
		return sum;

	}

}
