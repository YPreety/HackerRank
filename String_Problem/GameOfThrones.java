package String_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to lock the 
single door through which the enemy can enter his kingdom.
But, to lock the door he needs a key that is an anagram of a palindrome. He starts to go through his box of strings, checking to see if 
they can be rearranged into a palindrome.
Complete the GameOfThrones function below to determine whether a given string can be rearranged into a palindrome.
aaabbbb = yes , cdefghmnopqrstuvw = no
*/
public class GameOfThrones {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string 1 ");
		System.out.print(isPalindromePermutation(br.readLine()) ? "YES" : "NO");
		br.close();
	}

	private static boolean isPalindromePermutation(String str) {
		char[] chars = str.toCharArray();
		int bits = 0;
		int strLen = chars.length;
		for (int i = 0; i < strLen; bits = bits ^ (1 << (chars[i++] - 'a'))) {
		}
		return (bits & (bits - (strLen & 1))) == 0;
	}
}
