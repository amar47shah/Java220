/**
 * 
 */
package assignment_01;

import java.util.Scanner;

/**
 * @author amar
 *
 */
public class CoinsValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int quarters, dimes, nickels, pennies, centsTotal;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many of them coins do ya have there, little fella?\n");
		System.out.print("Quarters:\t");
		quarters = scan.nextInt();
		System.out.print("Dimes:\t\t");
		dimes = scan.nextInt();
		System.out.print("Nickels:\t");
		nickels = scan.nextInt();
		System.out.print("Pennies:\t");
		pennies = scan.nextInt();
		
		centsTotal = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
		
		System.out.println("\nWell, gosh, ya little varmint!");
		System.out.print("You got " + centsTotal / 100 + " dollars there...");
		System.out.println("and " + centsTotal % 100 + " cents!");
		
	}

}
