package Sorting_Problem;

import java.util.Scanner;

public class InsertionSortPart2 {

	public static void insertionSortPart(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int number = ar[i];
			int index = i - 1;
			while (index >= 0 && ar[index] > number) {
				ar[index + 1] = ar[index];
				index--;
			}
			ar[index + 1] = number;

			printArray(ar);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart(ar);

		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
