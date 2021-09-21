
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Sum of Digit is Pallindrome or not
class SumOFDIgitsIsPalindromeOrNot {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int N = Integer.parseInt(read.readLine());
			Solution ob = new Solution();
			System.out.println(ob.isDigitSumPalindrome(N));
		}
	}
}// } Driver Code Ends

// User function Template for Java

class Solution {
	int isDigitSumPalindrome(int N) {
		// code here
		int sumOFdigits = sumOFdigits(N);
		int reverseN = reverseN(sumOFdigits);
		if (reverseN == sumOFdigits) {
			return 1;
		} else {
			return 0;
		}
	}

	int reverseN(int n) {
		int rev = 0;
		while (n > 0) {
			rev = (rev * 10) + (n % 10);
			n = n / 10;
		}

		return rev;
	}

	int sumOFdigits(int n) {
		int sum = 0;
		if (n / 10 == 0) {
			return 0;
		}
		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
	}
}
