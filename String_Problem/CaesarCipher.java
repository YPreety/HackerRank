package String_Problem;

import java.util.Scanner;

/*Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of 
letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 
3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc*/

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1 ");
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt() % 26;
		String str = "";
		for (int i = 0; i < n; i++) {
			str = str + getUpdatedAsciiChar(s.charAt(i), k);
		}
		System.out.println(str);
	}

	static char getUpdatedAsciiChar(char ch, int incremental) {
		if (Character.isLetter(ch)) {
			int i = (int) ch;
			i = i + incremental;
			if (Character.isUpperCase(ch)) {
				if (i > 90) {
					int num = (int) ch + incremental;
					i = num - 26;
				}
			} else if (i > 122) {
				int num = (int) ch + incremental;
				i = num - 26;
			}
			return (char) i;
		}
		return ch;
	}
}
