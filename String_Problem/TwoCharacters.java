package String_Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*In this challenge, you will be given a string. You must remove characters until the string is made up of any two alternating characters. 
When you choose a character to remove, all instances of that character must be removed. Your goal is to create the longest string possible
that contains just two alternating letters.
As an example, consider the string abaacdabd. If you delete the character a, you will be left with the string bcdbd. 
Now, removing the character c leaves you with a valid string bdbd having a length of 4. Removing either b or d at any point would not 
result in a valid string.
input:
10
beabeefeab
output: 5*/

public class TwoCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		int len = in.nextInt();
		String s = in.next();
		Set<Character> dist = new HashSet<>();
		for (int i = 0; i < len; i++) {
			dist.add(s.charAt(i));
		}
		List<Character> distList = new ArrayList<>(dist);
		int max = 0;
		for (int i = 0; i < dist.size() - 1; i++) {
			for (int j = i + 1; j < dist.size(); j++) {
				char c1 = distList.get(i);
				char c2 = distList.get(j);
				String subset = s.replaceAll("[^" + c1 + "" + c2 + "]", "");
				if (isAlternating(subset)) {
					int l = subset.length();
					max = l > max ? l : max;
				}
			}
		}
		System.out.println(max);
	}

	private static boolean isAlternating(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

}
