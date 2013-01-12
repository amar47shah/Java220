package assignment_05_02_Hospital;

public class Receptionist extends Admin {

	public Receptionist (String title, String name, Double salary) 
	{
		super(title, name, salary);
	}
	
	public void makeAppointment()
	{
		System.out.println("I'm sorry, but YOU can't cancel without 24 hours notice.");
	}

}
