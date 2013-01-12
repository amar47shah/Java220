/**
 * 
 */
package assignment_02;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Amar Shah
 *         Exercise 3.6
 *
 */
public class TriangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double side1, side2, side3, semiPerimeter, area;
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("Enter the lengths of the triangle's sides:");
		
		System.out.print("\tSide 1: ");
		side1 = scan.nextDouble();
		
		System.out.print("\tSide 2: ");
		side2 = scan.nextDouble();
		
		System.out.print("\tSide 3: ");
		side3 = scan.nextDouble();
		
		semiPerimeter = 0.5 * (side1 + side2 + side3);
		area = Math.sqrt(semiPerimeter * (semiPerimeter - side1)
				                       * (semiPerimeter - side2)
				                       * (semiPerimeter - side3));
		
		System.out.println("The area of the triangle is " + fmt.format(area));
		
	}

}
