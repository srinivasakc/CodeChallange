package easy;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(29)); // true
		System.out.println(isPrime(35)); // false
		System.out.println(isPrime(20)); // false
		System.out.println(isPrime(27)); // false
		System.out.println(isPrime(7)); // true

	}

	public static boolean isPrime(int n) {

		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
