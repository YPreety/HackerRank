package String_Problem;

import java.util.Scanner;

/*We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. 
For example, if string s= haacckkerrannkk it does contain hackerrank, but   s= haacckkerannk does not. 
In the second case, the second r is missing. If we reorder the first string as haacckkerrannkk, it no longer contains the subsequence 
due to ordering.For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.
*/
public class hackerrankInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1 ");
		int q = in.nextInt();
		queries: for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			char[] find = "hackerrank".toCharArray();
			int findIndex = 0;

			for (char c : s.toCharArray()) {
				if (find[findIndex] == c)
					findIndex++;

				if (findIndex == find.length) { // We ran out of characters to
												// find
					System.out.println("YES");
					continue queries;
				}

			}
			System.out.println("NO"); // We didn't find all characters
		}

	}

}
