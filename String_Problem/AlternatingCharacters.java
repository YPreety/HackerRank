package String_Problem;

import java.util.Scanner;

/*You are given a string containing characters A and B only. Your task is to change it into a string such that every two consecutive 
characters are different. To do this, you are allowed to delete one or more characters in the string.
Your task is to find the minimum number of required deletions.
input :- AAAA ,BBBBB ,ABABABAB ,BABABA , AAABBB
output :- 3 , 4 ,0 ,0,  4
*/
public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		int tests = Integer.parseInt(in.nextLine());
		for (int i = 0; i < tests; i++) {
			String string = in.nextLine();
			int deletions = 0;
			char c = string.charAt(0);
			for (int j = 1; j < string.length(); j++) {
				if (c == string.charAt(j)) {
					deletions++;
				} else {
					c = string.charAt(j);
				}
			}
			System.out.println(deletions);
		}
		in.close();

	}

}
