package assignment_01;

import java.util.Scanner;

public class SquareMetrics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int side;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("SQUARE METRICS LAB\n");
		System.out.print("Length of side: ");
		side = scan.nextInt();
		System.out.println("\nPERIMETER:\t" + (4 * side));
		System.out.println("AREA:\t\t" + (side * side));
		

	}

}
