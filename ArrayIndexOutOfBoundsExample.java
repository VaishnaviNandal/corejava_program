//Write a program using exception handling to handle array index out of bounds.

package ANP_D0453;

public class ArrayIndexOutOfBoundsExample {
	public static void main(String[] args) {
		int[] numbers = {01, 02, 03, 04, 05}; 
		// Array with 5 elements

		try {
			// Trying to access an index outside the bounds of the array
			System.out.println("Element at index 10: " + numbers[10]); 
			// This will throw ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handling the ArrayIndexOutOfBoundsException
			System.out.println("Error: Array index is out of bounds. The valid indices are between 0 and " + (numbers.length - 1));
		}

		System.out.println("Program continues after exception handling.");
	}
}

/* Output:
Error: Array index is out of bounds. The valid indices are between 0 and 4
Program continues after exception handling.
 */
