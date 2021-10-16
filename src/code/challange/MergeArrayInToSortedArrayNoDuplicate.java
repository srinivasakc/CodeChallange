package code.challange;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MergeArrayInToSortedArrayNoDuplicate {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array1 length");
			int a1l = sc.nextInt();
			int[] array1 = new int[a1l + 1];

			System.out.println("Enter array1");

			int i = 0, j = 0, k = 0, l = 0;
			while (i <= a1l) {
				array1[k] = sc.nextInt();
				i++;
				k++;
			}
			System.out.println("Enter array2 length");
			int a2l = sc.nextInt();
			int[] array2 = new int[a2l + 1];

			System.out.println("Enter array2");
			while (j <= a2l) {
				array2[l] = sc.nextInt();
				l++;
				j++;
			}

			System.out.println("Merged array with not dupicated and sorted: "
					+ Arrays.toString(mergeArrayInToSortedArray(array1, array2)));
		}

	}

	public static int[] mergeArrayInToSortedArray(int[] a, int[] b) {

		int[] c = new int[a.length + b.length];
		int k = 0;
		for (int ar1 : a) {
			c[k] = ar1;
			k++;
		}
		for (int ar2 : b) {
			c[k] = ar2;
			k++;
		}

		// remove duplicated from array
		Set<Integer> seWithNoDuplicate = new HashSet<Integer>();
		for (int ac : c) {
			seWithNoDuplicate.add(ac);
		}

		// adding all the elements of set to array
		int[] mergeWithoutDuplicate = new int[seWithNoDuplicate.size()];

		Iterator<Integer> it = seWithNoDuplicate.iterator();
		int n = 0;
		while (it.hasNext()) {
			mergeWithoutDuplicate[n] = it.next();
			n++;

		}
		Arrays.sort(mergeWithoutDuplicate);
		System.out.println("Array 1: " + Arrays.toString(a));
		System.out.println("Array 2: " + Arrays.toString(b));
		return mergeWithoutDuplicate;

	}

}
