/* Write a java program to check given number is prime number or not */

package ANP_D0453;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 29;
		boolean flag = false;

		// 0 and 1 are not prime numbers
		if (num == 0 || num == 1) {
			flag = true;
		}

		for (int i = 2; i <= num / 2; ++i) {

			// condition for non prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			//Prints the prime number
			System.out.println(num + " is a prime number.");
		else
			//Prints it is not a prime number
			System.out.println(num + " is not a prime number.");
	}
}

/*Output:
29 is a prime number.
*/