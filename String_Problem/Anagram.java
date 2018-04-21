package String_Problem;

import java.util.Scanner;

/*Two words are anagrams of one another if their letters can be rearranged to form the other word.
In this challenge, you will be given a string. You must split it into two contiguous substrings, then determine the minimum number of 
characters to change to make the two substrings into anagrams of one another.
For example, given the string 'abccde', you would break it into two parts: 'abc' and 'cde'. Note that all letters have been used, the 
substrings are contiguous and their lengths are equal. Now you can change 'a' and 'b' in the first substring to 'd' and 'e' to have 'dec'
and 'cde' which are anagrams. Two changes were necessary.
*/
public class Anagram {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter string");
		int tests = stdin.nextInt();
		for (int i = 0; i < tests; i++) {
			String s = stdin.next();
			System.out.println(deletions(s));
		}
		stdin.close();
	}

	private static int deletions(String s) {
		if (s.length() % 2 != 0) {
			return -1;
		}
		String half1 = s.substring(0, s.length() / 2);
		String half2 = s.substring(s.length() / 2);
		for (int i = 0; i < half1.length(); i++) {
			if (half2.contains(half1.substring(i, i + 1))) {
				half2 = half2.replaceFirst(half1.substring(i, i + 1), "");
			}
		}
		return half2.length();
	}
}
