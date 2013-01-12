package assignment_04;

import java.util.Scanner;

public class HowManyVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numA, numE, numI, numO, numU, numOther, len;
		String yourString;
		
		System.out.print("Enter a string.  ");
		yourString = input.nextLine();
		
		numA = numE = numI = numO = numU = 0;
		len = yourString.length();
		
		for (int i = 0; i < len; i++) {
			switch (yourString.charAt(i)) {
				case 'a': numA++; break;
				case 'e': numE++; break;
				case 'i': numI++; break;
				case 'o': numO++; break;
				case 'u': numU++; break;
				default: break;
			}
		}
		
		numOther = len - numA - numE - numI - numO - numU;
		
		System.out.println("How many lowercase vowels were typed? ");
		System.out.println("\ta s: " + numA);
		System.out.println("\te s: " + numE);
		System.out.println("\ti s: " + numI);
		System.out.println("\to s: " + numO);
		System.out.println("\tu s: " + numU);
		System.out.println("other characters: " + numOther);
			
	}

}
