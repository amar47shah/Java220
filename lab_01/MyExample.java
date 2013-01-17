package lab_01;

import java.util.Scanner;

public class MyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a, b, c;
		double x1, x2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a: ");
		a = scan.nextInt();
		System.out.println("Please enter b: ");
		b = scan.nextInt();
		System.out.println("Please enter c: ");
		c = scan.nextInt();
		
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		System.out.println("The roots are " + x1 + " and " +  x2 + ".");

		scan.close();

	}

}
