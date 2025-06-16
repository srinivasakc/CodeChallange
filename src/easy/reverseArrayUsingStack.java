package easy;

import java.util.Stack;

public class reverseArrayUsingStack {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 3, 2, 6, 23, 1, 2, 3, 4, 5 };

		reverseArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	static void reverseArray(int arr[]) {
		int n = arr.length;
		// declare a stack
		Stack<Integer> st = new Stack<>();

		// push array elements into stack
		for (int i = 0; i < n; i++) {
			st.push(arr[i]);
		}

		// update elements of array
		int i = 0;
		while (st.empty() == false) {
			int top = st.peek();
			st.pop();
			arr[i] = top;
			i++;
		}
		return;
	}
}
