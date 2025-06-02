package easy;

//Prime numbers are natural numbers that are divisible by only 1 and the number itself
//The number 1 is not a prime number because it only has one positive divisor (itself), while prime numbers are defined as having exactly two distinct positive divisors
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(29)); // true
		System.out.println(isPrime(35)); // false
		System.out.println(isPrime(20)); // false
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
