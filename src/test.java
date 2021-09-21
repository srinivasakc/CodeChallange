// } Driver Code Ends

//User function Template for Java

class test {

	public static void main(String[] args) {
		// int a[] = { 10, 7, 5, 9, 7, 6 };
		int a[] = { 2, 5, 7, 9, 10, 6 };

		mergeSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}

	}
	// Arr is an array of integer type
	// start and end are the starting and ending index of current interval of Arr

	static void mergeSort(int Arr[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid + 1, end);
			merge(Arr, start, new int[Arr.length], mid, end);
		}
	}

	static int[] merge(int Arr[], int start, int temp[], int mid, int end) {

		// create a temp array
		// int temp[] = new int[end - start + 1];

		// crawlers for both intervals and for temp
		int i = start, j = mid + 1, k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in
		// temp
		while (i <= mid && j <= end) {
			if (Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
//				k += 1;
//				i += 1;
				i++;
			} else {
				temp[k] = Arr[j];
//				k += 1;
//				j += 1;
				j++;
			}
			k++;
		}

		// add elements left in the first interval
		while (i <= mid) {
			temp[k] = Arr[i];
			k += 1;
			i += 1;
		}

		// add elements left in the second interval
		while (j <= end) {
			temp[k] = Arr[j];
			k += 1;
			j += 1;
		}

		// copy temp to original interval
		for (i = start; i <= end; i += 1) {
			Arr[i] = temp[i - start];
		}
		return Arr;
	}

}