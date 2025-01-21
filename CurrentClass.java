//Write java program to invoke current class method using this keyword.

package ANP_D0453;

class CurrentClass {

	void display()
	{
		// calling function show()
		this.show();
		
		//prints the inside display function
		System.out.println("Inside display function");
	}

	void show()
	{
		//prints the inside show function
		System.out.println("Inside show function");
	}

	public static void main(String args[])
	// TODO Auto-generated method stub
	{
		CurrentClass t1 = new CurrentClass();
		t1.display();
	}
}

/*Output:
Inside show function
Inside display function
 */

