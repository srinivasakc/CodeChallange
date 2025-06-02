package easy;

import java.util.Arrays;
import java.util.Collections;

//this will work for unsorted no duplicate array
//if we have duplicate array can need to sorted to work
public class Array_reverse {
	public static void main(String[] args) {
		int[] inputArray = new int[] { 1, 4, 3, 2, 6, 5 };

		System.out.println(Arrays.toString(reverseArray(inputArray)));
//reverse the string using collections

		System.out.println(Arrays.toString(rev(inputArray)));
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

		// Print and display reverse updated array
		System.out.println("Modified Array : " + Arrays.toString(inputArray));
		return inputArray;

	}

}
