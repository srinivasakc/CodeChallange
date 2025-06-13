package easy;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String str = "Srinivasa";

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());

		}

	}

}
