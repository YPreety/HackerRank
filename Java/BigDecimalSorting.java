package Java;

import java.math.BigDecimal;
import java.util.*;

/*Java BigDecimal Sorting Solution
Java’s BigDecimal class can handle arbitrary-precision signed decimal numbers. Let’s test your knowledge of them!

Given an array, s, of n  real number strings, sort them in descending order — but wait, there’s more! Each number must be 
printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. 
If two numbers represent numerically equivalent values (e.g.,.1=0.1 ), then they must be listed in the same order as they 
were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array s‘s elements according to the 
instructions above.*/

public class BigDecimalSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		// input
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		// sorting
		Arrays.sort(s, 0, n, new Comparator<Object>() {
			public int compare(Object a1, Object a2) {
				BigDecimal bigDec1 = new BigDecimal((String) a1);
				BigDecimal bigDec2 = new BigDecimal((String) a2);
				return bigDec2.compareTo(bigDec1);
			}
		});
		// output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}

}
