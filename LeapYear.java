/*Write a program to check whether a given year is a leap year or not.*/

package ANP_D0453;
import java.io.*;
public class LeapYear {
 // Method to check leap year
 public static void isLeapYear(int year)
 {
     // Take a non-leap year by default
     boolean is_leap_year = false;

     // If year is divisible by 4
     if (year % 4 == 0) {
         is_leap_year = true;

         // To identify whether it is a century year or not
         if (year % 100 == 0) {
             // Checking if year is divisible by 400
             if (year % 400 == 0)
                 is_leap_year = true;
             else
                 is_leap_year = false;
         }
     }
     // If year is not divisible by 4
     else

         // Non leap-year
         is_leap_year = false;

     if (!is_leap_year)
         System.out.println(year + " : Non Leap year");
     else
         System.out.println(year + " : Leap year");
 }
 public static void main(String[] args)
 {
     // Calling the function by passing century year not divisible by 400
     isLeapYear(2004);

     // Calling the function by passing Non-century year
     isLeapYear(2002);
 }
}

/*Output
2004 : Leap year
2002 : Non Leap year */