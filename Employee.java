/* Write a java program to take Employee id, name, address, salary from user and display on to screen */ 

package ANP_D0453;
import java.util.Scanner;
public class Employee{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your employee Id:");
        int e = sc.nextInt();
        System.out.println("Please enter your employee Name:");
        String n = sc.next();
        System.out.println("Please enter your employee Address:");
        String a = sc.next();
        System.out.println("Please enter your Salary:");
        double s= sc.nextDouble();
    }
}


/*Output
Please enter your employee Id:
429
Please enter your employee Name:
Vaishu
Please enter your employee Address:
Solapur
Please enter your Salary:
50000*/