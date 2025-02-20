//Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]

package ANP_D0453;

import java.util.Arrays;
public class SortArray {
	public static void main(String[] args) {
		// Declare and initialize the array
		int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

		// Print the original array
		System.out.println("Original Array: " + Arrays.toString(numbers));

		// Sort the array in ascending order
		Arrays.sort(numbers);

		// Print the sorted array
		System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(numbers));
	}
}

/*Output: 
Original Array: [45, 35, 56, 67, 78, 89, 78, 12, 20]
Sorted Array in Ascending Order: [12, 20, 35, 45, 56, 67, 78, 78, 89]
 */