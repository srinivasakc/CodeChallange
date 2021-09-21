package datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Q. Given a String, print each character and number of its occurences.
 * Example: for String "hello world", print: h=1 l=3 etc..
 * 
 * Hint: Whenever you need to store 'key-value' pairs, you should use 'Map'
 * datastructure.
 */
public class MapDemo {
	public static void main(String[] args) {
		String s = "hello world";
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
