package Sorting_Problem;

import java.util.Arrays;
import java.util.Scanner;

/*The median of a list of numbers is essentially it's middle element after sorting. The same number of elements occur after it as 
before. Given a list of numbers with an odd number of elements, can you find the median?
*/
public class FindMedian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		Arrays.sort(ar);
		System.out.println(ar[ar.length / 2]);

		sc.close();

	}

}
