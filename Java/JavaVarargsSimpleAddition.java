package Java;

/*You are given a class Solution and its main method in the editor. 
Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the 
function add.

Note: Your add method in the Add class must print the sum as given in the Sample Output
*/
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaVarargsSimpleAddition {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			int n6 = Integer.parseInt(br.readLine());
			Add ob = new Add();
			ob.add(n1, n2);
			ob.add(n1, n2, n3);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5, n6);
			Method[] methods = Add.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Add {
	void add(int... numbers) {
		StringBuffer sb = new StringBuffer();
		int sum = 0;
		for (int num : numbers) {
			sb.append(num + "+");
			sum += num;
		}
		sb.setCharAt(sb.length() - 1, '=');
		sb.append(sum);
		System.out.println(sb);
	}
}