//Use recursion to add all of the numbers up to 10.
public class SumofAllNumberUP_TO_GIvenNumber {
	public static void main(String[] args) {

		int n = 10;
		System.out.println(getTheSum(n));

	}

	static int getTheSum(int n) {

		if (n > 0) {
			return n + getTheSum(n - 1);
		} else {
			return 0;
		}

	}
}
