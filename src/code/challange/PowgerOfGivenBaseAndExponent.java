package code.challange;

public class PowgerOfGivenBaseAndExponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3^4 =3*3*3*3

		int base = 3;
		int exponent = 3;
		int pow = 1;
		while (exponent > 0) {
			pow = pow * base;
			exponent--;
		}
		System.out.println(pow);
	}

}
