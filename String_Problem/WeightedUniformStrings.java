package String_Problem;

import java.util.HashSet;
import java.util.Scanner;

/*A weighted string is a string of lowercase English letters where each letter has a weight. Character weights are 1 to 26 from a to z
We define the following terms:
1)  The weight of a string is the sum of the weights of all the string's characters. 
For example: apple = 1+16 +16 +12 +5 = 50
2) A uniform string consists of a single character repeated zero or more times. 
For example, ccc and a are uniform strings, but bcb and cd are not.
*/
public class WeightedUniformStrings {

	private static HashSet<Integer> getWeights(String str) {
		HashSet<Integer> weights = new HashSet<>();
		int weight = 0;
		char prev = ' '; // so it doesn't match 1st character
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (curr != prev) {
				weight = 0;
			}
			weight += curr - 'a' + 1;
			weights.add(weight);
			prev = curr;
		}
		return weights;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.next();
		int n = scan.nextInt();
		HashSet<Integer> weights = getWeights(str);
		while (n-- > 0) {
			int x = scan.nextInt();
			System.out.println(weights.contains(x) ? "Yes" : "No");
		}
		scan.close();
	}

}
