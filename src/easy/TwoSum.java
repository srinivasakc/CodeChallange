package easy;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println("two sum: " + Arrays.toString(result));// [0,1]

		int[] result2 = twoSum(new int[] { 3, 2, 4 }, 6);
		System.out.println("two sum: " + Arrays.toString(result2));// [1,2]
	}

	public static int[] twoSum(int[] nums, int target) {

		int l = nums.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (nums[i] + nums[j] == target) {

					return new int[] { i, j };
				}
			}

		}

//		return new int[] {};
		return null;
	}
}
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
