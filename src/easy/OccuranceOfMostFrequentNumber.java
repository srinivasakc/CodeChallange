package easy;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class OccuranceOfMostFrequentNumber {

	public static void main(String[] args) {
		String str = "auuttttomaiton";
		char result = frequentNumber(str);
		System.out.println(result);

	}

	public static char frequentNumber(String str2) {
		char freqChar = '\0';// initialize char to null
		int max = 0;
		int count;
		HashMap<Character, Integer> map = new LinkedHashMap<>();// read the character in order
		for (char c : str2.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				count = map.put(c, map.get(c) + 1);
				if (max < count) {
					max = count;
					freqChar = c;
				}
			}
		}

		return freqChar;
	}

}
