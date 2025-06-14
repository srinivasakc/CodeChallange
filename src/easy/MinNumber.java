package easy;

public class MinNumber {

	public static void main(String[] args) {
		System.out.println(min(new int[] { 4, 781, 8, 99, 103 })); // 4
		System.out.println(min(new int[] { 1, 2, 3, 4, 5 })); // 1
		System.out.println(min(new int[] { 3, 4 })); // 3
		System.out.println(min(new int[] { 100 })); // 100
	}

	public static int min(int[] arrNum) {
		// assume first element of array is the smallest number
		int min = arrNum[0];

		// loop over the array and test assumption
		for (int n : arrNum) {
			// if min was not smallest, update it
			if (min > n) {
				min = n;
			}
		}

		return min;
	}
}