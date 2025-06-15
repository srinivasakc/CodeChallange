package easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "auutomaiton";
		char result = firstNonRepeatingCharacter(str);
		System.out.println(result);

	}

	public static char firstNonRepeatingCharacter(String str2) {

		HashMap<Character, Integer> map = new LinkedHashMap<>();// read the character in order
		for (char c : str2.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}

			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 1) {
					return entry.getKey();
				}
			}

		}
		return '\0';

	}
}
