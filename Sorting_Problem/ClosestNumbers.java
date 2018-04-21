package Sorting_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Sorting is useful as the first step in many different tasks. The most common task is to make finding things easier, but there are 
other uses as well. In this case, it will make it easier to determine which pair or pairs of elements have the smallest absolute 
difference between them.
*/
public class ClosestNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int minDiff = Integer.MAX_VALUE;
		List<Integer> indices = new ArrayList<Integer>();
		for (int i = 0; i < a.length - 1; i++) {
			int diff = a[i + 1] - a[i];
			if (diff < minDiff) {
				minDiff = diff;
				indices.clear();
				indices.add(i);
			} else if (diff == minDiff) {
				indices.add(i);
			}
		}

		for (int i = 0; i < indices.size(); i++) {
			if (i != 0) {
				System.out.print(" ");
			}

			System.out.print(a[indices.get(i)] + " " + a[indices.get(i) + 1]);
		}

		sc.close();

	}

}
