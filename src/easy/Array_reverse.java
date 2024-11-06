package easy;

import java.util.Arrays;
import java.util.Collections;

public class Array_reverse {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(revArr(inputArray)));
		reverse(inputArray);
	}

	public static int[] revArr(int[] inputArray) {

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
	}

	static void reverse(int inputArray[]) {
		Collections.reverse(Arrays.asList(inputArray));
		System.out.println(Arrays.toString(inputArray));
	}

}
