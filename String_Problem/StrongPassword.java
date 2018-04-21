package String_Problem;

import java.util.Scanner;

/*Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. 
However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:
1) Its length is at least .
2) It contains at least one digit.
3) It contains at least one lowercase English character.
4) It contains at least one uppercase English character.
5) It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length n in the password field but wasn't sure if it was strong. Given the string she typed, can you find the
minimum number of characters she must add to make her password strong?
*/

public class StrongPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1 ");
		int n = in.nextInt();
		String password = in.next();
		int answer = minimumNumber(n, password);
		System.out.println(answer);
		in.close();

	}

	static int minimumNumber(int n, String password) {
		int digitCount = 0;
		int lowerCount = 0;
		int upperCount = 0;
		int specialCount = 0;
		int addCount = 0;
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				digitCount++;
			} else if (Character.isLowerCase(c)) {
				lowerCount++;
			} else if (Character.isUpperCase(c)) {
				upperCount++;
			} else {
				specialCount++;
			}
		}
		if (digitCount == 0) {
			addCount++;
			digitCount++;
		}
		if (lowerCount == 0) {
			addCount++;
			lowerCount++;
		}
		if (upperCount == 0) {
			addCount++;
			upperCount++;
		}
		if (specialCount == 0) {
			addCount++;
			specialCount++;
		}
		int total = digitCount + lowerCount + upperCount + specialCount;
		if (total - 6 < 0) {
			addCount += 6 - total;
		}
		return addCount;
	}

}
