package String_Problem;

import java.util.Scanner;

/*We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other 
words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc 
and dcbad are not.
Alice is taking a cryptography class and finding anagrams to be very useful. She decides on an encryption scheme involving two large 
strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. 
Can you help her find this number?
i/p : cde abc	o/p = 4
*/
public class MakingAnagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1 ");
		System.out.println("Enter string 2");
		String s1 = in.next();
		String s2 = in.next();
		int result = makingAnagrams(s1, s2);
		System.out.println(result);

	}

	static int makingAnagrams(String s1, String s2) {
		int[] c1 = new int[256];
		int[] c2 = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			int index = (int) (s1.charAt(i));
			c1[index] += 1;
		}
		for (int i = 0; i < s2.length(); i++) {
			int index = (int) (s2.charAt(i));
			c2[index] += 1;
		}
		int ans = 0;
		for (int i = 0; i < 256; i++) {
			ans += Math.abs(c1[i] - c2[i]);
		}
		return ans;
	}

}
