package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationNumberArray {

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, 0, result);
		return result;
	}

	private static void backtrack(int[] nums, int index, List<List<Integer>> result) {
		// Base case: If the current index reaches the end, a permutation is complete
		if (index == nums.length) {
			// Convert the array to a List<Integer> and add to the result
			List<Integer> currentPermutation = new ArrayList<>();
			for (int num : nums) {
				currentPermutation.add(num);
			}
			result.add(currentPermutation);
			return;
		}

		// Recursive step: Iterate through remaining elements
		for (int i = index; i < nums.length; i++) {
			// Swap the element at 'index' with the element at 'i'
			swap(nums, index, i);

			// Recursively call for the next index
			backtrack(nums, index + 1, result);

			// Backtrack: Undo the swap to explore other possibilities
			swap(nums, index, i);
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> permutations = permute(nums);
		System.out.println("All permutations of " + Arrays.toString(nums) + ":");
		for (List<Integer> p : permutations) {
			System.out.println(p);
		}
	}
}