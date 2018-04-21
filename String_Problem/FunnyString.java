package String_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the 
string in reverse e.g. abc -> cba . Iterating through each string, compare the absolute difference in the ascii values of the characters 
at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

Enter string
2
acxz
bcxz
Funny
Not Funny
*/
public class FunnyString {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		for (byte T = Byte.parseByte(br.readLine()); T > 0; --T) {
			sb.append(isFunny(br.readLine().toCharArray()) ? "Funny\n" : "Not Funny\n");
		}
		System.out.print(sb);
	}

	private static boolean isFunny(final char[] S) {
		for (int i = 0, n = S.length - 2; i < n; ++i, --n) {
			if (Math.abs(S[i] - S[i + 1]) != Math.abs(S[n] - S[n + 1])) {
				return false;
			}
		}
		return true;
	}

}
