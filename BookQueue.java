//Q:2.Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.

package ANP_D0453;

import java.util.ArrayDeque;

public class BookQueue {
	public static void main(String[] args) {
		// Creating an ArrayDeque to store book names
		ArrayDeque<String> books = new ArrayDeque<>();

		// Adding books to both ends
		books.addFirst("The Great Gatsby");
		books.addLast("1984");
		books.addFirst("To Kill a Mockingbird");
		books.addLast("Moby-Dick");

		// Displaying the books in the queue
		System.out.println("Books in the queue: " + books);

		// Removing books from both ends
		String removedFirst = books.removeFirst();
		System.out.println("Removed from front: " + removedFirst);
		String removedLast = books.removeLast();
		System.out.println("Removed from end: " + removedLast);

		// Displaying the remaining books in the queue
		System.out.println("Remaining books in the queue: " + books);
	}
}
/* Output:
Books in the queue: [To Kill a Mockingbird, The Great Gatsby, 1984, Moby-Dick]
Removed from front: To Kill a Mockingbird
Removed from end: Moby-Dick
Remaining books in the queue: [The Great Gatsby, 1984]
 */