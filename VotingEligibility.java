/*Write java program to check candidate is eligible for voting or not using if -else statement*/

package ANP_D0453;
import java.util.*;
public class VotingEligibility
{
  public static void main (String[]args)
  {
    // Declaring variables
    int age;
    // Taking age as input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter Your Age: ");
    age = scan.nextInt();
    // Condition for vote
    if(age>=18)
    {
        System.out.println("You are eligible for voting.");
    }
    else
    {
    System.out.println("You are not eligible for voting.");
    }
  }
}

/*Output
Please Enter Your Age: 
22
You are eligible for voting. */
