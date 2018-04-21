package Sorting_Problem;

import java.util.Scanner;

/*The running time of an algorithm for a specific input depends on the number of operations executed. The greater the number of 
operations, the longer the running time of an algorithm. We usually want to know how many operations an algorithm will execute 
in proportion to the size of its input, which we will call N.
What is the ratio of the running time of Insertion Sort to the size of the input? To answer this question, we need to examine the 
algorithm.
*/
public class RunningTimeAlgorithms {

	public static void insertionSort(int[] A) {
		int shiftNum = 0;
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > value) {
				A[j + 1] = A[j];
				j = j - 1;
				shiftNum++;
			}
			A[j + 1] = value;
		}

		System.out.println(shiftNum);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);

		in.close();
	}

}
