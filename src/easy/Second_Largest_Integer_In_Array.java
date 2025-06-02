package easy;

import java.util.Arrays;
import java.util.TreeSet;

public class Second_Largest_Integer_In_Array {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 5, 7, 23, 67, 54, 33 };

		System.out.println(secondLargetIntegerInArray(arr));
		System.out.println(secondLargetIntegerInArrayUsingSet(arr));

	}

	private static int secondLargetIntegerInArray(int[] arr) {
		// using sort
		Arrays.sort(arr);
		return arr[arr.length - 2];

	}

	private static int secondLargetIntegerInArrayUsingSet(int[] arr) {

		TreeSet<Integer> ts = new TreeSet<>();
		for (int n : arr) {
			ts.add(n);
		}
		/*
		 * we cannot access the Element Directly So to access the Element we need to
		 * convert the set to array or list to access the element
		 */
		int[] arrayB = new int[ts.size()];
		int i = 0;
		for (int num : ts) {
			arrayB[i] = num;
			i++;
		}
		// convertinf to list
//		List<Integer> list = new ArrayList<>(ts);
//		System.out.println(list.get(list.size() - 2));

		return arrayB[arrayB.length - 2];

	}

}
