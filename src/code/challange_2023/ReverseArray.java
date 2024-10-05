package code.challange_2023;

public class ReverseArray {
	public static void main(String args[]) {
		int[] aNum = { 1, 2, 3, 4, 5, 6 };
		revArray(aNum);
		// System.out.println(revArray(aNum));

		// power of 2
	}

	public static void revArray(int[] aNum) {
		int length = aNum.length;

		int[] bArray = new int[length];
		int j = length;
		System.out.println(length);

		for (int i = 0; i < length; i++) {
			bArray[j - 1] = aNum[i];
			j--;
		}

		System.out.println("Reverses array is: \n");
		for (int k = 0; k < bArray.length; k++) {

			System.out.print(bArray[k]);
			System.out.print(",");
		}

	}

}
