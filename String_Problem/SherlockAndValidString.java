package String_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*Sherlock considers a string to be valid if it all characters of the string appear the same number of times. It is also valid if he can 
remove just 1 character at 1 index in the string, and the remaining characters will occur the same number of times. Given a string s, 
determine if it is valid.
aabbcd = no , aabbccddeefghi = no
*/
public class SherlockAndValidString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string 1 ");
		final char[] S = br.readLine().toCharArray();
		System.out.print(isValid(S) ? "YES" : "NO");
	}

	private static boolean isValid(final char[] S) {
		if (S.length < 2) {
			return true;
		}
		final int[] L = new int[26];
		for (int i = 0, N = S.length; i < N; ++L[S[i++] - 'a']) {
		}
		Arrays.sort(L);
		int i;
		for (i = 0; i < 26 && L[i] == 0; ++i) {
		}
		if (L[i] == L[25]) {
			return true;
		}
		if (L[25] > L[24]) {
			return L[i] == L[24] && L[25] - L[24] == 1;
		}
		return L[i] < L[i + 1] && L[i + 1] == L[25] && L[i] == 1;
	}

}
