package String_Problem;

import java.util.Scanner;

/*James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the 
letter. He changes all the words in the letter into palindromes.
To do this, he follows two rules:
1) He can only reduce the value of a letter by , i.e. he can change d to c, but he cannot change c to d or d to b.
2) The letter a may not be reduced any further.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert
a given string into a palindrome.
i/t 4 , abc, abcba , abcd , cba
o/p:=  2 , 0, 4, 2
Explanation
For the first test case, abc -> abb -> aba.
For the second test case, abcba is already a palindromic string.
For the third test case, abcd -> abcc -> abcb -> abca = abca -> abba.
For the fourth test case, cba -> bba -> aba.*/
public class LoveLetterMystery {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter string");
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            String s = stdin.next();
            int diff = 0;
            for(int j = 0; j < s.length() / 2; j++) {
                diff += Math.abs(Character.codePointAt(s, j) - Character.codePointAt(s, s.length() - j - 1));
            }
            System.out.println(diff);
        }
        stdin.close();

	}

}
