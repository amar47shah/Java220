package assignment_04;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student
{
	private String	firstName, lastName;
	private ArrayList<Integer> testScores = new ArrayList<Integer>();


	public Student(String first, String last, 
			        Integer score1, Integer score2, Integer score3)
	{
		firstName = first;
		lastName = last;
		testScores.add(score1);
		testScores.add(score2);
		testScores.add(score3);
	}
	
	public Student(String first, String last)
	{
		firstName = first;
		lastName = last;
		testScores.add(0);
		testScores.add(0);
		testScores.add(0);
	}

	public String toString()
	{
		String result;
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		result = firstName + " " + lastName + "\n";
		for (int i = 0; i < 3; i++) {
			result += "Test Score " + (i + 1) + ":\t" 
			          + testScores.get(i) + "\n";
		}
		result += "Grade Average:\t" + fmt.format(this.average());

		return result;
	}
	
	public void setTestScore(Integer testNumber, Integer testScore)
	{
	    if (testNumber >= 1 && testNumber <= 3) {
	    	testScores.set(testNumber - 1, testScore);
	    }
	    	
	}
	
	public Integer getTestScore(Integer testNumber)
	{
		if (testNumber >= 1 && testNumber <= 3) {
			return testScores.get(testNumber - 1);
		}
		else {
			return 0;
		}
			
	}
	
	public Double average()
	{
		return ( testScores.get(0) +
				  testScores.get(1) + 
				  testScores.get(2) ) / 3.0;
	}
}

