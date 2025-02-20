//Q:1. Write a program using Vector to store the list of students details and print the details.
package ANP_D0453;

import java.util.Vector;

//Class representing a student with a different name to avoid conflicts
class StudentInfo {
	private String name;
	private int age;
	private String course;

	public StudentInfo(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
	}
}

public class StudentVector {
	public static void main(String[] args) {
		Vector<StudentInfo> students = new Vector<>();

		students.add(new StudentInfo("Vaishu", 20, "Computer Science"));
		students.add(new StudentInfo("Shubhangi", 22, "Mechanical Engineering"));
		students.add(new StudentInfo("Bhagyam", 21, "Electronics"));

		System.out.println("Student Details:");
		for (StudentInfo student : students) {
			student.display();
		}
	}
}
/* Output:
Student Details:
Name: Vaishu, Age: 20, Course: Computer Science
Name: Shubhangi, Age: 22, Course: Mechanical Engineering
Name: Bhagyam, Age: 21, Course: Electronics
 */