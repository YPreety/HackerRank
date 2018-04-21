package String_Problem;

import java.util.Scanner;

/*A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string. 
Given two strings of equal length, what's the longest string that can be constructed such that it is a child of both?
For example, ABCD and ABDC have two children with maximum length 3, ABC and ABD. They can be formed by eliminating either the D or C 
from both strings. Note that we will not consider ABCD as a common child because we can't rearrange characters and ABCD  ABDC.
*/
public class CommonChild {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String a = in.next();
		String b = in.next();
		System.out.println(findMaxCommonLength(a, b));

		in.close();
	}

	static int findMaxCommonLength(String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();
		int[][] commonLengths = new int[length1 + 1][length2 + 1];
		for (int i = 1; i <= length1; i++) {
			for (int j = 1; j <= length2; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					commonLengths[i][j] = commonLengths[i - 1][j - 1] + 1;
				} else {
					commonLengths[i][j] = Math.max(commonLengths[i - 1][j], commonLengths[i][j - 1]);
				}
			}
		}
		return commonLengths[length1][length2];
	}
}
