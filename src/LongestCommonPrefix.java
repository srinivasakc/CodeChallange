//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
////Longest Common Prefix using Word by Word Matching
//class LongestCommonPrefix {
//	public static void main(String[] args) throws Exception, IOException {
//		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(read.readLine());
//		String a[] = new String[t];
//		int i = 0;
//		while (i < t) {
//			a[i] = read.readLine();
//			i++;
//		}
//		System.out.println(getLongestPrefix(a));
//	}
//
//	static String getLongestPrefix(String a[]) {
//		Arrays.sort(a);
//		String r = "";
//		if (a[0]=="")
//			return "";
//		if (a.length == 1)
//			return a[0];
//
//		StringBuilder sb = new StringBuilder();
//		int fl = a[0].length();
//		for (int i = 0; i < fl; i++) {
//			if (a[0].charAt(i) == a[a.length - 1].charAt(i)) {
//				// r = r + a[0].charAt(i);
//				r = sb.append(a[0].charAt(i)).toString();
//			} else {
//				break;
//			}
//		}
//		return r;
//	}
//}
