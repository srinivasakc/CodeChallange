import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

//All unique triplets that sum up to a given value
public class Unique_TripletThatSumTo_A_GivenValue {

	// returns all triplets whose sum is
	// equal to sum value
	public static List<List<Integer>> findTriplets(int[] nums, int sum) {

		/* Sort the elements */
		Arrays.sort(nums);

		List<List<Integer>> pair = new ArrayList<>();
		TreeSet<String> set = new TreeSet<String>();
		List<Integer> triplets = new ArrayList<>();

		/*
		 * Iterate over the array from the start and consider it as the first element
		 */
		for (int i = 0; i < nums.length - 2; i++) {

			// index of the first element in the
			// remaining elements
			int j = i + 1;

			// index of the last element
			int k = nums.length - 1;

			while (j < k) {

				if (nums[i] + nums[j] + nums[k] == sum) {

					String str = nums[i] + ":" + nums[j] + ":" + nums[k];

					if (!set.contains(str)) {

						// To check for the unique triplet
						triplets.add(nums[i]);
						triplets.add(nums[j]);
						triplets.add(nums[k]);
						Collections.sort(triplets);
						pair.add(triplets);
						triplets = new ArrayList<>();
						set.add(str);
					}

					// increment the second value index
					j++;

					// decrement the third value index
					k--;
				} else if (nums[i] + nums[j] + nums[k] < sum)
					// increment the second value index

					j++;

				else {
					// decrement the third value index
					k--;
				}
			}
		}
		return pair;
	}

	// Driver code
	public static void main(String[] args) {
		int[] nums = { 6, 8, 3, 2, 1, 12, 11, 6, 5, 6, 7, 9, 10, 4, 6, 8, 3, 2, 1, 12, 11, 6, 1, 6, 9, 12, 3, 6, 1, 6,
				9, 12, 3, 6, 1, 6, 9 };
		int sum = 24;

		List<List<Integer>> triplets = findTriplets(nums, sum);

		// Function call
		if (!triplets.isEmpty()) {
			System.out.println(triplets);
		} else {
			System.out.println("No triplets can be formed");
		}
	}
}