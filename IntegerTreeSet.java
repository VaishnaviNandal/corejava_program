//Q:3.Write a program using TreeSet insert Integer values and print them.

package ANP_D0453;

import java.util.TreeSet;

public class IntegerTreeSet {
	public static void main(String[] args) {
		// Creating a TreeSet to store integer values
		TreeSet<Integer> numbers = new TreeSet<>();

		// Inserting integer values into the TreeSet
		numbers.add(25);
		numbers.add(10);
		numbers.add(5);
		numbers.add(30);
		numbers.add(15);

		// Printing the sorted integer values in the TreeSet
		System.out.println("Sorted Integer Values in TreeSet: " + numbers);
	}
}
/* Output:
Sorted Integer Values in TreeSet: [5, 10, 15, 25, 30]
 */