package code.challange;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram_Using_Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String a = sc.next();
		System.out.println("Enter Aanagram");
		String b = sc.next();

		System.out.println(isAnagram(a, b));

	}

	public static boolean isAnagram(String a, String b) {
		Map<Character, Integer> mapA = new HashMap<Character, Integer>();
		Map<Character, Integer> mapB = new HashMap<Character, Integer>();
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		// map A
		for (char s0 : arr1) {
			if (mapA.get(s0) == null) {
				mapA.put(s0, 1);
			} else {
				Integer i = (int) mapA.get(s0);
				mapA.put(s0, ++i);
				// mapA.put(s, mapA.get(s) + 1);

			}
		}

		// map B
		for (char s1 : arr2) {
			if (mapB.get(s1) == null) {
				mapB.put(s1, 1);
			} else {
				Integer j = (int) mapB.get(s1);
				mapB.put(s1, ++j);
				// mapA.put(s, mapA.get(s) + 1);

			}
		}

		if (mapA.equals(mapB)) {
			return true;
		} else {
			return false;
		}
	}
}
