package code.challange_2023;

public class ReverseNumbers {
	public static void main(String args[]) {
		System.out.println(numRev(14546));
	}

	public static int numRev(int num) {
		int rev = 0, lastNumber = 0;

		while (num > 0) {

			lastNumber = num % 10;
			rev = rev * 10 + lastNumber;
			num = num / 10;

//			System.out.println(String.valueOf(lastNumber));
//			System.out.println(String.valueOf(rev));
//			System.out.println(String.valueOf(num));
		}

		return rev;
	}
}
