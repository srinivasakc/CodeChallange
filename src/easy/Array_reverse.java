package easy;

import java.util.Arrays;
import java.util.Collections;

//this will work for unsorted no duplicate array
//if we have duplicate array can need to sorted to work
public class Array_reverse {
	public static void main(String[] args) {
		int[] inputArray = new int[] { 3, 6, 9, 8, 10, 3 };
		Arrays.sort(inputArray);
		System.out.println(Arrays.toString(reverseArray(inputArray)));
//reverse the string using collections
		rev(inputArray);
	}

	public static int[] reverseArray(int[] inputArray) {
		int start = 0;
		int end = inputArray.length - 1;
		while (start < end) {
			int temp = start;
			start = inputArray[end];
			end = temp;
			start++;
			end--;
		}

		return inputArray;
	};

	public static void rev(int[] inputArray) {
		Collections.reverse(Arrays.asList(inputArray));
		System.out.println(Arrays.toString(reverseArray(inputArray)));
	}

}
