package String_Problem;

import java.util.Scanner;

/*Given a string of lowercase letters in the range ascii[a-z], determine a character that can be removed to make the string a palindrome. 
There may be more than one solution, but any will do. For example, if your string is "bcbc", you can either remove 'b' at index 0 or 'c' 
at index 3 . If the word is already a palindrome or there is no solution, return -1. Otherwise, return the index of a character to remove.
i/p :- aaab , baa , aaa
o/p :- 3 , 0 , -1
*/
public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1 ");
		int n = input.nextInt();
		input.nextLine();
		tests: for (int t = 0; t < n; t++) {
			String s = input.nextLine();
			int outputIndex = -1;
			boolean removal = false;
			for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
				if (s.charAt(i) != s.charAt(j)) {
					if (removal) {
						removal = false;
						outputIndex = -1;
						break;
					}
					if (s.charAt(i + 1) == s.charAt(j)) {
						removal = true;
						outputIndex = i;
						i++;
					} else if (s.charAt(i) == s.charAt(j - 1)) {
						removal = true;
						outputIndex = j;
						j--;
					} else {
						removal = false;
						outputIndex = -1;
						break;
					}
				}
			}
			if (outputIndex != -1) {
				System.out.println(outputIndex);
				continue tests;
			}
			for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
				if (s.charAt(i) != s.charAt(j)) {
					if (removal) {
						System.out.println(-1);
						continue tests;
					}
					if (s.charAt(i) == s.charAt(j - 1)) {
						removal = true;
						outputIndex = j;
						j--;
					} else if (s.charAt(i + 1) == s.charAt(j)) {
						removal = true;
						outputIndex = i;
						i++;
					} else {
						System.out.println(-1);
						continue tests;
					}
				}
			}
			System.out.println(outputIndex);
		}
	}
}
