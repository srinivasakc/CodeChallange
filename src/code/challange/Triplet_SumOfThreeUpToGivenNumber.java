package code.challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Triplet_SumOfThreeUpToGivenNumber {

	public static void main(String[] args) {
//		int[] array = { 5, 6, 7, 9, 10, 4, 6, 8, 3, 2, 1, 12, 11 };
//		int n = 20;

		int[] nums = { 6, 8, 3, 2, 1, 12, 11, 6, 5, 6, 7, 9, 10, 4, 6, 8, 3, 2, 1, 12, 11, 6, 1, 6, 9, 12, 3, 6, 1, 6,
				9, 12, 3, 6, 1, 6, 9 };
		int sum = 24;
		tripletSumUpToN(nums, sum);
	}

	private static void tripletSumUpToN(int[] nums, int n) {
		/* Sort the elements */
		Arrays.sort(nums);
		TreeSet<String> setTree = new TreeSet<>();
		List<Integer> tripletsList = new ArrayList<>();
		List<List<Integer>> pair = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {

			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {

				int sum = nums[i] + nums[j] + nums[k];
				if (sum == n) {
					String strTriplet = nums[i] + "," + nums[j] + "," + nums[k];

					if (!setTree.contains(strTriplet)) {
						tripletsList.add(nums[i]);
						tripletsList.add(nums[j]);
						tripletsList.add(nums[k]);
						Collections.sort(tripletsList);
						pair.add(tripletsList);
						tripletsList = new ArrayList<>();
						setTree.add(strTriplet);
					}

					// triplet
					// System.out.println("Triplets of sum [" + n + "] are: " + nums[i] + ", " +
					// nums[j] + ", " + nums[k]);

					j++;
					k--;
				} else if (sum < n) {
					j++;
				} else {
					k--;
				}

			}

		}
		System.out.println(pair);

	}

}
