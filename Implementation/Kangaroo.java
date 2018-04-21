package Implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();

		System.out.println((v1 > v2 && (x2 - x1) % (v1 - v2) == 0) ? "YES" : "NO");

		sc.close();

	}

}
