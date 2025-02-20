//Write a program demonstrating  Exception handling using try catch for Arithmetic Exception.

package ANP_D0453;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		try {
			// Trying to divide by zero, which will cause an ArithmeticException
			int result = 50 / 0;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			// Handling the ArithmeticException
			System.out.println("Error: Cannot divide by zero.");
		}

		System.out.println("Program continues after exception handling.");
	}
}

/* Output:
Error: Cannot divide by zero.
Program continues after exception handling.
 */