/**
 * 
 */
package assignment_01;

import java.util.Scanner;

/**
 * @author amar
 *
 */
public class TimeRequired {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int distance, speed;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How far? ");
		distance = scan.nextInt();
		System.out.print("How fast? ");
		speed = scan.nextInt();

		System.out.print("It will take " + ( 1.0 * distance / speed ));
		System.out.println(" hours to get there.");
		
	}

}
