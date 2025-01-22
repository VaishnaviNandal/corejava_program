/*Create a parent class called "Person" with attributes such as 
 * name, age, and a method called "speak". Create a child class 
 * called "Student" that inherits from Person and has an additional
 * attribute called "grade" and a method called "study".
 * Create an object of the Student class and call both the "speak" and "study" methods.
 */

package ANP_D0453;

//Parent class Person
class Person{
	String name="Vaishnavi";
	int age=22;
	//creating a method speak in parent class
	public void speak() {
		System.out.println("Name="+name +"\n"+ "Age="+age);
	}
}
//Child class extends the properties of parent class
class Student extends Person{
	String grade="A";
	//creating a method study in child class
	public void study() {
		System.out.println("Grade="+grade);
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		//creating an object of a student class
		Student obj=new Student();
		//calling the methods speak and study
		obj.speak();
		obj.study();
	}
}

/*Output:
Name=Vaishnavi
Age=22
Grade=A
*/
