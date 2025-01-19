/* Write a java program to check given number is perfect number or not */

package ANP_D0453;

public class PerfectNumber {
	// Returns true if n is perfect
	static boolean isPerfect(int n)
	{
		// 1 is not a perfect number
		if (n == 1)
			return false;

		int sum = 1;

		// Looping through the numbers to check if they are divisors or not
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				sum += i;
			}
		}

		// If sum of divisors is equal to n, then n is a perfect number
		if (sum == n)
			return true;

		return false;
	}
	public static void main(String[] args)
	{
		int n = 6;

		// Call isPerfect function to check if the number is perfect or not.
		if (isPerfect(n))
			System.out.println(n + " is a perfect number");
		else
			System.out.println(n + " is not a perfect number");
	}
}

/*Output:
6 is a perfect number
*/
