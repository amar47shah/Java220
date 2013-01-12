package assignment_05_05_Pascal;

import java.util.Scanner;

public class Pascal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sure, I'll show ya Pascal's Triangle,");
		System.out.println("but only one row at a time!\n");
		
		do
		{
			System.out.print("Which row?  ");
			i = scan.nextInt();
		
			if (i >= 0) {
				System.out.print("Good choice.  ");
				new PascalRow(i);
			}
		} while (i >= 0);

		System.out.println("You just had to, didn't ya?");
	}
}
