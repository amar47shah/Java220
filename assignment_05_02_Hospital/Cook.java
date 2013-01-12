package assignment_05_02_Hospital;

public class Cook extends Support {

	public Cook(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}

	public void serve()
	{
		System.out.println("I don't know what it is. I just cook it!");
	}
}
