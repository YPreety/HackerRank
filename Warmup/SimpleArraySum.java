package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleArraySum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Skip first line
		br.readLine();

		// Sum input
		long sum = 0;
		for (String s : br.readLine().split(" ")) {
			sum += Integer.parseInt(s);
		}

		// Print sum
		System.out.print(sum);
	}

}
