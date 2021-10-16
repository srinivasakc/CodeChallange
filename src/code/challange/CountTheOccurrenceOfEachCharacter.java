package code.challange;

import java.util.HashMap;
import java.util.Map;

//String string = "this is a sample Example"
//Output:
//t - 1
//h - 1
//i - 2
//s - 3
//Java program to count the occurrence of each character in a string using Hashmap
public class CountTheOccurrenceOfEachCharacter {

	public static void main(String[] args) {
		String str = "this is a sample Example";
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		cMap = getCharactersRepeatedInString(str);
		for (Map.Entry<Character, Integer> c : cMap.entrySet()) {
			System.out.println(c.getKey() + "- " + c.getValue());
		}

	}

	public static Map<Character, Integer> getCharactersRepeatedInString(String test) {

		// Creating a HashMap containing char
		// as a key and occurrences as a value
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		// Converting given string to char array
		char[] arry = test.toCharArray();
		// checking each char of strArray
		for (char c : arry) {
			// If char is present in charCountMap,
			// incrementing it's count by 1
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				cMap.put(c, 1);
			}
		}

		return cMap;

	}
}
