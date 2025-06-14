package easy;

public class MaxNumber {

	public static void main(String[] args) {
		System.out.println(max(new int[] { 4, 781, 8, 99, 103 })); // 781
		System.out.println(max(new int[] { 1, 2, 3, 4, 5 })); // 5
		System.out.println(max(new int[] { 3, 4 })); // 4
		System.out.println(max(new int[] { 100 })); // 100
	}

	public static int max(int[] arrNum) {
		// assume first element of array is the biggest number
		int max = arrNum[0];

		// loop over the array and test our above assumption
		for (int num : arrNum) {
			// if max was not the biggest number, update it
			if (max < num) {
				max = num;
			}
		}

		// after the loop max variable will hold the biggest number
		return max;
	}

}