package String_Problem;

import java.util.Scanner;

/*Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 
	A<B<..... <Y<Z<a<b.......<y<z
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, 
and abc.
input welcometojava
output:- smallest :- ava largest :- wel
*/
public class JavaSubstringComparisons {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int length = sc.nextInt();
        String smallest="";
        String largest="";
        for(int i = 0;i<=inputString.length()-length;i++){
            String subString = inputString.substring(i,i+length);
            if(i == 0){
                smallest = subString;
            }
            if(subString.compareTo(largest)>0){
                largest = subString;
            }else if(subString.compareTo(smallest)<0)
                smallest = subString;
        }
        System.out.println("smallest " + smallest);
        System.out.println(" largest " +largest);

	}

}
