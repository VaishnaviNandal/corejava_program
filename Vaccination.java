/*Create abstract class vaccine.Create two variables age(int),nationality(String).
create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take 
the first dose if the user is Indian and age is 18.After vaccination the user has 
to pay 250rs(which will be displayed on the console). Scenario 2: Users are eligible 
to take the second dose only after completing the first dose. Scenario 3: 
create abstract method boosterDose() in abstract class Vaccine.
Create one implementation class vaccinationSuccessful, where implement 
boosterDose() method. Create main class vaccination and invoke all methods 
accordingly. [Hint:Create constructor to initialize variables age and 
nationality,Use flow control(Ifelse) to check condition]
*/

package ANP_D0453;

abstract class Vaccine{
	int age;
	String nationality;
	
	// Constructor to initialize variables
	public Vaccine(int age, String nationality) {
		this.age = age;
		this.nationality = nationality;
	}

	//Concrete method 
	void firstDose() {
		if(age>=18 && nationality.equalsIgnoreCase("Indian")) {
			System.out.println("First dose completed successfully");
			System.out.println("Please Pay Rs. 250");
	System.out.println("------------------------------------------------");
		}else {
			System.out.println("You are not eligible for the first dose");
				
		}
			
	}
	//concrete method
	void secondDose(boolean isFirstDoseCompleted) { 
		if (isFirstDoseCompleted) {
			System.out.println("Second dose completed successfully.");
			System.out.println("------------------------------------------------");
		} else {
			System.out.println("You are not eligible for the second dose. Please take the first dose first.");
		}
	}

	//Abstract method
	public abstract void boosterDose(boolean isFirstDoseCompleted,boolean isSecondDoseCompleted); 
}

//Implementation CLass
class VaccinationSuccessful extends Vaccine {

	// Constructor
	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
	}

	// Implementation of boosterDose
	@Override
	public void boosterDose(boolean isFirstDoseCompleted, boolean isSecondDoseCompleted) {
		if (isFirstDoseCompleted && isSecondDoseCompleted) {
			System.out.println("Booster dose completed successfully.");
		} else {
			System.out.println("You are not eligible for the booster dose. Please complete both the first and second doses.");
		}
	}
}

// Main Class
public class Vaccination {
	public static void main(String[] args) {
		// Create an instance of VaccinationSuccessful
		VaccinationSuccessful user = new VaccinationSuccessful(20, "Indian");

		// Invoke first dose
		System.out.println("Checking eligibility for the first dose.");
		user.firstDose();

		// Simulate the first dose being completed
		boolean isFirstDoseCompleted = true;

		// Invoke second dose
		System.out.println("Checking eligibility for the second dose.");
		user.secondDose(isFirstDoseCompleted);

		// Simulate the second dose being completed
		boolean isSecondDoseCompleted = true;

		// Invoke booster dose
		System.out.println("Checking eligibility for the booster dose.");
		user.boosterDose(isFirstDoseCompleted, isSecondDoseCompleted);
	}
}

/*Output:
Checking eligibility for the first dose.
First dose completed successfully
Please Pay Rs. 250
------------------------------------------------
Checking eligibility for the second dose.
Second dose completed successfully.
------------------------------------------------
Checking eligibility for the booster dose.
Booster dose completed successfully.
*/