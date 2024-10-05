package code.challange;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {

//		int[] b = twoSum(new int[] { 3, 2, 4 }, 6);
//		System.out.println(Arrays.toString(b));

		int c = sumFourDivisors(new int[] { 7286, 18704, 70773, 8224, 91675 });
		System.out.println(c);
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					a[0] = i;
					a[1] = j;
				}

			}
		}
		return a;
	}

	public static int sumFourDivisors(int[] nums) {
		List<Integer> divisors = new ArrayList<Integer>();
		int sum = 0;
		for (int n : nums) {
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					divisors.add(i);
				}
				i++;
			}

			if (divisors.size() == 4) {
				for (int d : divisors) {
					sum = sum + d;
				}

			}
			divisors = new ArrayList<Integer>();

		}
		if (sum > 0) {
			return sum;
		} else {
			return 0;
		}

	}
}
