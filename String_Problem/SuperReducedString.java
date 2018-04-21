package String_Problem;

/*Steve has a string s,consisting of n  lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters 
with same value. For example, string "aabcc" would become either "aab" or "bcc" after 1 operation.
input : - aaabccddd , aa , baab
output:-  abd, Empty String, Empty String
*/
import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
        String s = in.nextLine();
        String acc = "";
        for(int i =0 ; i<s.length(); i++){
            char c = s.charAt(i);
            if(acc.length()>0 && acc.charAt(acc.length()-1)==c){
                acc = acc.substring(0, acc.length()-1);
            }else{
                acc += c;
            }
        }
        System.out.println(acc.isEmpty() ? "Empty String" :acc);
	}
}
