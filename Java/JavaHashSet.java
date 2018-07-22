package Java;

import java.util.HashSet;
import java.util.Scanner;

/*In computer science, a set is an abstract data type that can store certain values, without any particular order, and no 
repeated values(Wikipedia). {1,2,3}  is an example of a set, but {1,2,2} is not a set. Today you will learn how to use sets 
in java by solving this problem.

You are given  pairs of strings. Two pairs (a,b) and (c,d) are identical if a==c and b=d. That also implies (a,b) is not same 
as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.
*/
public class JavaHashSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		// logic of problem without using HashSet.
		HashSet<String> pairs = new HashSet<String>(t);
		for (int j = 0; j < t; j++) {
			pairs.add("(" + pair_left[j] + ", " + pair_right[j] + ")");
			System.out.println(pairs.size());
		}
	}// end-method

}
