package code.challange;

import java.util.Arrays;
import java.util.Scanner;
/*Write a function to check whether two given strings are anagram of
each other or not. An anagram of a string is another string that contains 
the same characters, only the order of characters can be different.
 For example, “abcd” and “dabc” are an anagram of each other.*/
//tringle integral

public class Anagram_Using_Sort_CharArray {
//Anagram String a=b and a contains all the craracters in string b
	// e.g a= Mango b = ongnam
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String a = sc.next();
		System.out.println("Enter Aanagram");
		String b = sc.next();

		System.out.println(isAnagramBySort(a, b));

	}

	private static boolean isAnagramBySort(String a, String b) {
		char[] cA = a.toCharArray();
		char[] cB = a.toCharArray();
		Arrays.sort(cA);
		Arrays.sort(cB);
		if (cA.length != cB.length) {
			return false;
		}
		int i = 0;
		for (char c : cA) {
			if (cA[i] != cB[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}