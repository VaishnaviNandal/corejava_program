//Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]

package ANP_D0453;

import java.util.Arrays;
import java.util.Collections;

public class SortString {
	public static void main(String[] args) {
		// Declare and initialize the array of strings
		String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

		// Print the original array
		System.out.println("Original Array: " + Arrays.toString(letters));

		// Sort the array in descending order using a custom comparator
		Arrays.sort(letters, Collections.reverseOrder());

		// Print the sorted array
		System.out.println("Sorted Array in Descending Order: " + Arrays.toString(letters));
	}
}

/*Output: 
Original Array: [A, X, D, Z, Y, C, W, B]
Sorted Array in Descending Order: [Z, Y, X, W, D, C, B, A]
*/
