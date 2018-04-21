package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

	public static void main(String[] args) throws IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Get size of staircase
		final int N = Integer.parseInt(br.readLine());

		// Print stairs
		String stair = "#";
		final String format = "%" + N + "s\n";
		for (int i = 0; i < N; ++i) {
			System.out.print(String.format(format, stair));
			stair += "#";
		}
	}

}
