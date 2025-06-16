package easy;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12 };
		int counter = -1;

		while (counter != 0) {

			counter = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					counter++;
				}

			}

		}
		System.out.println(Arrays.toString(arr));

	}

}
