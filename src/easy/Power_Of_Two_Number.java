package easy;

public class Power_Of_Two_Number {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(-3));
		System.out.println(isPowerOfTwo(256));
		System.out.println(isPowerOfTwo(65));
		System.out.println(isPowerOfTwo(1));

	}

	// check n is power of 2
	private static boolean isPowerOfTwo(int n) {

		if (n == 0) {
			return false;// when n equals zero return false
		}
		while (n != 1) {// when n not equal to 1, divide the number by 2
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}

		return true;
	}

}
