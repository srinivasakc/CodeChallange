package easy;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Second_Min_Integer_In_Array {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 5, 7, 23, 67, 54, 33 };

		System.out.println(secondLargetIntegerInArray(arr));
		System.out.println(secondLargetIntegerInArrayUsingSet(arr));

	}

	private static int secondLargetIntegerInArray(int[] arr) {
		// using sort
		Arrays.sort(arr);
		return arr[1];

	}

	private static int secondLargetIntegerInArrayUsingSet(int[] arr) {

		Set<Integer> st = new TreeSet<>();
		for (int n : arr) {
			st.add(n);
		}
		int[] arrB = new int[st.size()];
		int i = 0;
		// iterate set and add the value to new array;
		for (int num : st) {
			arrB[i] = num;
			i++;
		}

		return arrB[1];

	}

}
