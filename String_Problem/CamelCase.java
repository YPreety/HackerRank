package String_Problem;

/*Alice wrote a sequence of words in CamelCase as a string of letters, s , having the following properties:
1) It is a concatenation of one or more words consisting of English letters.
2) All letters in the first word are lowercase.
3) For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given s, print the number of words in s on a new line.
input: - saveChangesInTheEditor
output: - 5
Explanation :- String  contains five words:   save  Changes  In  The  Editor*/

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
        String s = in.next();
        String words [] = s.split("[A-Z]");
        System.out.println(words.length);
	}
}
