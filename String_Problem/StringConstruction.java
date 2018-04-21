package String_Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Amanda has a string of lowercase letters that she wants to copy to a new string. She can perform the following operations with the given
costs. She can perform them any number of times to construct a new string p:
Append a character to the end of string p at a cost of 1 dollar.
Choose any substring of   p and append it to the end of p at no charge.
Given n strings s[i], find and print the minimum cost of copying each  s[i] to p[i] on a new line.
abcd = 4 , abab = 2
*/
public class StringConstruction {

	static int cost(String s) {
		char[] c = s.toCharArray();
		Map<Character, Boolean> m = new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			m.put(c[i], true);
		}
		return m.size();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1 ");
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = cost(s);
			System.out.println(result);
		}
		in.close();
	}

}
