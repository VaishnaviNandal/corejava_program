/*Create a parent class called "Vehicle" with attributes such as 
 * brand, model, year, and a method called "drive". Create a child 
 * class called "Car" that inherits from Vehicle and has an additional 
 * attribute called "color" and a method called "honk". 
 * Create an object of the Car class and call both the "drive" and "honk" methods.
 */

package ANP_D0453;

//Parent class Vehicle
class Vehicle{
	String brand="Honda";
	String model="Mahindra Scorpio N";
	int year=10;
	//creating a method drive in the vehicle class that is a parent class
	void drive() {
		System.out.println("Brand="+brand +"\n"+ "Model="+model +"\n"+ "Year="+year);
	}
}
class Car extends Vehicle{
	String color="Black";
	//creating a method honk in the car class that is the child class which extends the parent class
	void honk() {
		System.out.println("Color="+color);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		//creating the object of the child class
		Car obj=new Car();
		//Calling the methods drive and honk
		obj.drive();
		obj.honk();
	}
}

/*Output:
Brand=Honda
Model=Mahindra Scorpio N
Year=10
Color=Black

 */
