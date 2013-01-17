package lab_01;

import java.util.Scanner;

public class HowManySeconds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int hours, minutes, seconds, secondsTotal;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many hours?");
		hours = scan.nextInt();
		System.out.println("How many minutes?");
		minutes = scan.nextInt();
		System.out.println("How many seconds?");
		seconds = scan.nextInt();
		
		secondsTotal = ((hours * 60) + minutes) * 60 + seconds;
		
		System.out.println("The total number of seconds is " + secondsTotal);
		
	}

}
