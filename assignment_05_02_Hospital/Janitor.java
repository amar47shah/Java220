package assignment_05_02_Hospital;

public class Janitor extends Support {

	public Janitor(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}
	
	public void takeOutTheTrash()
	{
		System.out.println("Ok, that's it! You're a-comin' with me!");
	}

}
