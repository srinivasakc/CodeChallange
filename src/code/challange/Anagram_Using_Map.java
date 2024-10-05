package code.challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Anagram_Using_Map {
//Anagram String a=b and a contains all the craracters in string b
	// e.g a= Mango b = ongnam
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string a");
		String a = bf.readLine();
		System.out.println("Enter string b");
		String b = bf.readLine();

		System.out.println(isAnagram(a, b));

	}

	private static boolean isAnagram(String a, String b) {
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		Map<Character, Integer> m2 = new HashMap<Character, Integer>();

		for (char c : c1) {
			if (!m1.containsKey(c)) {
				m1.put(c, 1);
			} else {
				m1.put(c, m1.get(c) + 1);
			}
		}

		for (char d : c2) {
			if (!m2.containsKey(d)) {
				m2.put(d, 1);
			} else {
				m2.put(d, m2.get(d) + 1);
			}
		}
		if (m1.equals(m2)) {/// ******
			return true;
		} else {
			return false;
		}
	}

}
