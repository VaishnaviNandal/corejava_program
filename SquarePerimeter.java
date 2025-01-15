/*Write a Java program to find the perimeter of the square*/

package ANP_D0453;

import java.util.Scanner;
public class SquarePerimeter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double area, side, perimeter;
        
        area = 25;

        // Calculate side length
        side = Math.sqrt(area);

        // Calculate perimeter
        perimeter = 4 * side;

        System.out.println("Perimeter: " + perimeter);
    }
}
/*Output:
Perimeter: 20.0
*/
