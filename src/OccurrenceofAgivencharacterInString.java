//Program to count occurrence of a given character in a string
class OccurrenceofAgivencharacterInString {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char c = 'e';
		int occurance = getOccurrenceOfgivenCharacter(str, c);
		System.out.println(occurance);
	}

	static int getOccurrenceOfgivenCharacter(String str, char c) {
		int l = str.length();
		int i = 0, cnt = 0;
		while (i < l) {
			if (str.charAt(i) == c) {
				cnt++;
			}
			i++;
		}
		return cnt;
	}
}
class bar{
	
}