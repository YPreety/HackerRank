package String_Problem;

import java.util.Scanner;
/*A numeric string, s , is beautiful if it can be split into a sequence of two or more positive integers
input :-  1234 , 91011 , 99100 , 101103 , 010203 , 13 ,1
output :-  YES 1 , YES 9 , YES 99 , NO , NO , NO , NO*/
public class SeparateNumbers {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter string");
		int tests = Integer.parseInt(stdin.nextLine());
		t: for (int i = 0; i < tests; i++) {
			String s = stdin.nextLine();
			for (int j = 1; j <= s.length() / 2; j++) {
				String head = s.substring(0, j);
				long headVal = Long.parseLong(head);
				long next = headVal + 1;
				String rest = s.substring(j);
				if (isContinous(rest, next)) {
					System.out.println("YES " + head);
					continue t;
				}
			}
			System.out.println("NO");
		}
		stdin.close();

	}

	private static boolean isContinous(String rest, long next) {
		String nextS = String.valueOf(next);
		int i = nextS.length();
		while (i <= rest.length()) {
			if (!rest.startsWith(nextS)) {
				return false;
			} else {
				next = next + 1;
				rest = rest.substring(i);
				nextS = String.valueOf(next);
				i = nextS.length();
			}
		}
		if (!rest.isEmpty()) {
			return false;
		}
		return true;
	}

}
