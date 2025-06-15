package easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String str = "auutomaiton";

		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());

		}

		System.out.println(countLetters("hello")); // {h=1, e=1, l=2, o=1}
		System.out.println(countLetters("aauuchhh")); // {a=2, u=2, c=1, h=3}
		System.out.println(countLetters("aaaaaa")); // {a=6}
		System.out.println(countLetters("abc")); // {a=1, b=1, c=1}

	}

	public static Map<Character, Integer> countLetters(String str) {
		// if order is matter, we can use LinkedHashMap instead
		Map<Character, Integer> letters = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// if map already contains the key, get the value and put back with +1
			if (letters.containsKey(ch)) {
				letters.put(ch, letters.get(ch) + 1);
			} else {
				// if it does not contain char as key, new letter put with value 1
				letters.put(ch, 1);
			}
		}

		return letters;
	}

}
