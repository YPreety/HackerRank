package String_Problem;

import java.util.Scanner;

/*Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring "010".
In one step, Alice can change a 0 to a 1 or vice versa. Count and print the minimum number of steps needed to make Alice see the string as beautiful.
For example, if Alice's string is b= 010 she can change any one element and have a beautiful string.
input : - 0101010 output :- 2
*/
public class BeautifulBinaryString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
        int l = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        String beautiful = s. replace("010" , "b");
        int changes = beautiful.replaceAll("[01]","").length();
        System.out.println(changes);
        in.close();

	}

}
