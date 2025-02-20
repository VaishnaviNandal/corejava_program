//Write a program demonstrating multiple catch statements and finally block.

package ANP_D0453;

public class MultipleCatchFinallyExample {
	public static void main(String[] args) {
		try {
			// Code that can throw different types of exceptions
			int num1 = 50;
			int num2 = 0;
			int result = num1 / num2;  
			// This will throw ArithmeticException

			String str = null;
			System.out.println(str.length());  
			// This will throw NullPointerException

		} catch (ArithmeticException e) {
			// Handle ArithmeticException
			System.out.println("Error: ArithmeticException occurred. Cannot divide by zero.");
		} catch (NullPointerException e) {
			// Handle NullPointerException
			System.out.println("Error: NullPointerException occurred. Object is null.");
		} catch (Exception e) {
			// Handle any other exception
			System.out.println("Error: An unexpected error occurred.");
		} finally {
			// This block will always execute, whether an exception occurs or not
			System.out.println("Finally block executed. Cleanup or final operations.");
		}

		System.out.println("Program continues after exception handling.");
	}
}

/* Output:
Error: ArithmeticException occurred. Cannot divide by zero.
Finally block executed. Cleanup or final operations.
Program continues after exception handling.
 */