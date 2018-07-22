package Java;

import java.util.Scanner;

public class JavaStdinandStdoutI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println(in.nextInt());
		}

		in.close();
	}
}
