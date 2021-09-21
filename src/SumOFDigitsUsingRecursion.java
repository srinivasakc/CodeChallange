
public class SumOFDigitsUsingRecursion {
	public static void main(String[] args) {

		int n = 13434;
		System.out.println(getSumOfDigits(n));
	}

	static int getSumOfDigits(int n) {
		if (n == 0)
			return 0;
		return (n % 10) + getSumOfDigits(n / 10);
	}
}
