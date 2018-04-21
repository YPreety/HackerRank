package String_Problem;

import java.util.Scanner;

/*Roy wanted to increase his typing speed for programming contests. His friend suggested that he type the sentence 
"The quick brown fox jumps over the lazy dog" repeatedly. This sentence is known as a pangram because it contains every letter of 
the alphabet.After typing the sentence several times, Roy became bored with it so he started to look for other pangrams.
Given a sentence, determine whether it is a pangram.
input: - We promptly judged antique ivory buckles for the next prize  
output: -pangram*/
public class Pangrams {

	public static final int n = 26;

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter string");
		String s = s1.nextLine();
		Pangrams obj = new Pangrams();
		int d = obj.check(s);
		if (d == -1)
			System.out.print("not pangram");
		else
			System.out.print("pangram");
	}

	public int check(String arr) {
		if (arr.length() < n) {
			return -1;
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if ((arr.indexOf(c) < 0) && (arr.indexOf((char) (c + 32)) < 0)) {
				return -1;
			}
		}
		return 1;
	}
}
