
public class MergeSort {
	public static void main(String[] args) {
		int a[] = { 2, 5, 7, 9, 10, 6 };

		mergesort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);

		}

	}

	public static void mergesort(int a[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergesort(a, start, mid);
			mergesort(a, mid + 1, end);
			sort(a, start, new int[a.length], mid, end);
		}

	}

	public static int[] sort(int a[], int start, int temp[], int mid, int end) {

		int i = start;
		int j = mid + 1;
		int k = 0;

		// int temp[] = new int[end - start + 1];

		while (i <= mid && j <= end) {
			if (a[i] <= a[j]) {
				temp[k] = a[i];
				i++;
				// k++;
			} else {
				temp[k] = a[j];
				j++;
				// k++;
			}
			k++;

		}
		while (i <= mid) {
			temp[k] = a[i];
			i++;
			k++;
		}
		while (j <= end) {
			temp[k] = a[j];
			j++;
			k++;
		}
		// copy temp to original interval
		for (i = start; i <= end; i += 1) {
			System.out.println(i + " " + start);
			a[i] = temp[i - start];
		}

		return a;
	}

}
