//Write a Java Program  to pass  this keyword as argument in the constructor call.

package ANP_D0453;

public class ThisKey { 
	
	//Declaring the variable
	int x; 
	
	// Constructor with a parameter
	public ThisKey(int x) { 
		this.x = x; 
	} 

	// Call the constructor
	public static void main(String[] args)  { 
		// TODO Auto-generated method stub
		ThisKey myObj = new ThisKey(10); 
		System.out.println("Value of x = " + myObj.x);
	}  
}

/*Output:
Value of x = 10
*/