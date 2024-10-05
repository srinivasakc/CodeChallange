package code.challange;

public class MaxInArray {

	public static void main(String[] args) {
		int[] n = { 23, 5, 45, 66, 66, 25 };
		int max = maxInArray(n);
		System.out.println("Maximum in given array is: " + max);

	}

	public static int maxInArray(int[] n) {
		int max = 0;
		for (int num : n) {
			if (num > max) {
				max = num;
			}
		}

		return max;

	}

}
