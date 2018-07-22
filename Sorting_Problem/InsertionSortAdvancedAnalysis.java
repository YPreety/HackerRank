package Sorting_Problem;

import java.util.Scanner;

public class InsertionSortAdvancedAnalysis {

	static int getSum(int BITree[], int index) {
		int sum = 0;
		while (index > 0) {
			sum = sum + BITree[index];
			index = index - (index & (-index));
		}
		return sum;
	}

	static void updateBIT(int BITree[], int n, int index, int val) {
		while (index <= n) {
			BITree[index] = BITree[index] + val;
			index = index + (index & (-index));
		}
	}

	static long getInvCount(int arr[], int n) {
		long invcount = 0;
		int maxElement = 0;
		for (int i = 0; i < n; i++) {
			if (maxElement < arr[i])
				maxElement = arr[i];
		}
		int BIT[] = new int[maxElement + 1];
		for (int i = 1; i <= maxElement; i++) {
			BIT[i] = 0;
		}
		for (int i = n - 1; i >= 0; i--) {
			invcount = invcount + getSum(BIT, arr[i] - 1);
			updateBIT(BIT, maxElement, arr[i], 1);
		}
		return invcount;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int totalTime = s.nextInt();
		long inversion[] = new long[totalTime];
		int length = 0;
		for (int i = 1; i <= totalTime; i++) {
			int formArray = s.nextInt();
			int data[] = new int[formArray];
			length = data.length;
			for (int j = 0; j < formArray; j++) {
				data[j] = s.nextInt();

			}
			inversion[i - 1] = getInvCount(data, length);
		} // outer loop
		for (long k : inversion)
			System.out.println(k);
	}
}
