/**
 * 
 */
package assignment_02;

import java.util.Scanner;
import java.util.Random;

/**
 * @author amar
 *
 */
public class UserName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName, lastName, userName;
		Random generator = new Random(System.nanoTime());
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What's your first name? ");
		firstName = scan.next();
		
		System.out.print("What's your last name? ");
		lastName = scan.next();
		
		userName = firstName.substring(0, 1) + 
				   lastName.substring(0, 5) +
				   (generator.nextInt(90) + 10);
		
		System.out.println("Your user name is " + userName + ".");

	}

}
