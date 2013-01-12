package assignment_05_02_Hospital;

public class Surgeon extends Doctor {

	public Surgeon(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}

	public void operate()
	{
		System.out.println("Don't worry, you won't feel a thing.");
	}
}
