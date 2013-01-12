/**
 * 
 */
package assignment_02;

import java.util.Random;
import java.text.DecimalFormat;
/**
 * @author amar
 *
 */
public class RandomTrig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(System.nanoTime());
		DecimalFormat fourPlaces = new DecimalFormat("0.####");
		
		int angleInDegrees = generator.nextInt(21) + 20;
		double angleInRadians = angleInDegrees * Math.PI / 180; 
		
		System.out.println("cos(" + angleInDegrees + ") = "
		                   + fourPlaces.format(Math.cos(angleInRadians)));
		System.out.println("sin(" + angleInDegrees + ") = "
				           + fourPlaces.format(Math.sin(angleInRadians)));
		System.out.println("tan(" + angleInDegrees + ") = "
				           + fourPlaces.format(Math.tan(angleInRadians)));
	}

}
