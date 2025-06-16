package easy;

import java.util.Arrays;
import java.util.Collections;

public class Array_reverse {
	public static void main(String[] args) {
		int[] inputArray = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(reverseArray(inputArray)));

		inputArray = new int[] { 10, 3, 2, 6, 23, 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(reverseArray(inputArray)));
		int[] inputArray1 = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(rev(inputArray1)));

	}

	public static int[] reverseArray(int[] inputArray) {
		int start = 0;
		int end = inputArray.length - 1;
		while (start < end) {
			int temp = inputArray[start];
			inputArray[start] = inputArray[end];
			inputArray[end] = temp;
			start++;
			end--;
		}

		return inputArray;
	};

	public static int[] rev(int[] inputArray) {

		System.out.println("Original Array : " + Arrays.toString(inputArray));

		Collections.reverse(Arrays.asList(inputArray));

//		System.out.println("Modified Array : " + Arrays.toString(inputArray));
		return inputArray;

	}

}
