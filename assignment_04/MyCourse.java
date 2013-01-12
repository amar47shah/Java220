package assignment_04;

import java.text.DecimalFormat;

public class MyCourse 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		Course algebra = new Course("Algebra");
		
		Student margie = new Student ("Margaret", "Kohn");
		Student tom = new Student ("Thomas", "St. Claire");
		Student terri = new Student ("Terese", "Alvarez");
		Student koffi = new Student ("Koffi", "Kofangnibo");
		Student jack = new Student ("Jacqueline", "Welch");
		
		for (int testNum = 1; testNum <= 3; testNum++)
		{
			margie.setTestScore(testNum, (int)(Math.random() * 30) + 71);
			tom.setTestScore(testNum, (int)(Math.random() * 30) + 71);
			terri.setTestScore(testNum, (int)(Math.random() * 30) + 71);
			koffi.setTestScore(testNum, (int)(Math.random() * 30) + 71);
			jack.setTestScore(testNum, (int)(Math.random() * 30) + 71);			
		}
		
		algebra.addStudent(margie);
		algebra.addStudent(tom);
		algebra.addStudent(terri);
		algebra.addStudent(koffi);
		algebra.addStudent(jack);
		
		algebra.roll();
		System.out.println("The overall course average grade is " + 
		                   fmt.format(algebra.average()));

	}

}
