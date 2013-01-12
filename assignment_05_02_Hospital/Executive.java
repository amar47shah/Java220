package assignment_05_02_Hospital;

public class Executive extends Admin {

	public Executive(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}
	
	public void grub()
	{
		System.out.println("Well, the money doesn't hurt either.");
	}
}
