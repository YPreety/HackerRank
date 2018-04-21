package String_Problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*John has collected various rocks. Each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter 
in the range ascii[a-z]. There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in 
each of the rocks in John's collection.Given a list of minerals embedded in each of John's rocks, display the number of types of 
gemstones he has in his collection.
3
abcdde
baccd
eeabg
2
*/
public class GemStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		int rocks = in.nextInt();
		char[] first = in.next().toCharArray();
		Set<Character> result = new HashSet<>();
		for (char c : first) {
			result.add(c);
		}
		for (int i = 1; i < rocks; i++) {
			char[] composition = in.next().toCharArray();
			Set<Character> set = new HashSet<>();
			for (char d : result) {
				for (int j = 0; j < composition.length; j++) {
					if (d == composition[j]) {
						set.add(composition[j]);
					}
				}
			}
			result = set;
		}
		System.out.println(result.size());
		in.close();

	}

}
