/*Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
Subclasses extend the superclass and override its location() and famousFor() method. 
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. 
As it refers to the base class object and the base class method overrides the superclass method; 
the base class method is invoked at runtime. 
ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
*/

package ANP_D0453;
//Superclass
class HillStation {
	// Method to display location
	public void location() {
		System.out.println("Location of the hill station.");
	}

	// Method to display what the hill station is famous for
	public void famousFor() {
		System.out.println("Famous for something.");
	}
}

//Subclass Manali
class Manali extends HillStation {
	@Override
	public void location() {
		System.out.println("Manali is located in Himachal Pradesh.");
	}

	@Override
	public void famousFor() {
		System.out.println("Manali is famous adventure sports.");
	}
}

//Subclass Mussoorie
class Mussoorie extends HillStation {
	@Override
	public void location() {
		System.out.println("Mussoorie is located in Uttarakhand.");
	}

	@Override
	public void famousFor() {
		System.out.println("Mussoorie is famous for the Mall Road.");
	}
}

//Subclass Gulmarg
class Gulmarg extends HillStation {
	@Override
	public void location() {
		System.out.println("Gulmarg is located in Jammu and Kashmir.");
	}

	@Override
	public void famousFor() {
		System.out.println("Gulmarg is famous for the Gulmarg Gondola.");
	}
}

//Main class to test the methods
public class HillStationMain {
	public static void main(String[] args) {
		// Using superclass reference to refer to subclass objects
		HillStation hill1 = new Manali();
		HillStation hill2 = new Mussoorie();
		HillStation hill3 = new Gulmarg();

		// Calling overridden methods
		System.out.println("Calling methods using superclass reference:");
		hill1.location();
		hill1.famousFor();

		hill2.location();
		hill2.famousFor();

		hill3.location();
		hill3.famousFor();

		System.out.println("--------------------------------------------");

		// Calling methods using subclass references
		System.out.println("\nCalling methods using subclass references:");
		Manali manali = new Manali();
		Mussoorie mussoorie = new Mussoorie();
		Gulmarg gulmarg = new Gulmarg();

		manali.location();
		manali.famousFor();

		mussoorie.location();
		mussoorie.famousFor();

		gulmarg.location();
		gulmarg.famousFor();
	}
}

/* Output: 
 
Calling methods using superclass reference:
Manali is located in Himachal Pradesh.
Manali is famous adventure sports.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for the Mall Road.
Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for the Gulmarg Gondola.
--------------------------------------------

Calling methods using subclass references:
Manali is located in Himachal Pradesh.
Manali is famous adventure sports.
Mussoorie is located in Uttarakhand.
Mussoorie is famous for the Mall Road.
Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for the Gulmarg Gondola.

*/
