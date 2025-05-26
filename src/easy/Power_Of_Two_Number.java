package easy;

public class Power_Of_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isPowerOfTwo(31))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (isPowerOfTwo(64))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean isPowerOfTwo(int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			return false;
		}
		while (n > 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}

		return true;
	}

}
