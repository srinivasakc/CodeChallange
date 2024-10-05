package code.challange;

import java.util.Arrays;

public class MissingDigit {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 8, 7, 4, 10, 9 };
		Arrays.sort(arr);
		int n = arr[arr.length - 1];
		int totalSum = n * (n + 1) / 2;
		System.out.println(totalSum);
		// sum of given numbers in array
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println(sum);

		System.out.println("Given array sorted: " + Arrays.toString(arr));
		System.out.println("Missing number in the array: " + (totalSum - sum));
	}
}
