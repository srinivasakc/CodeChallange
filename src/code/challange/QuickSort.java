package code.challange;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arr = new int[arraySize];
		for (int i = 0; i <= arraySize; i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr);
	}

	private static void quickSort(int[] arr) {

		int pivot = arr[0];
		int start = 0;
		int end = arr[arr.length];
		while (start < end) {
			while (arr[start] <= pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}

			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}

	}

}
