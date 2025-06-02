package easy;

//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class Palindrome_Number {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(2442));
	}

	private static boolean isPalindrome(int num) {
		// keep num in temp, initialise reverse and remainder to zero
		int rev = 0, reminder = 0, temp = num;
		// number less than zero or (num divided by 10 wil no remainder and not equal to
		// zero)
		if (num < 0 || (num % 10 == 0 && num != 0)) {// num<0 and single digit like 1, 2,4,5....
			return false;
		}
		// reverse the number
		while (num > 0) {
			reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num / 10;
		}
		// palindrome if original number is equal to reversed number
		if (temp == rev) {
			return true;
		} else {
			return false;
		}
	}

}
