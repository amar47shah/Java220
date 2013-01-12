package assignment_05_02_Hospital;

public abstract class MedicalEmployee extends Employee {

	public MedicalEmployee(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}
	
	public void welcome()
	{
		super.welcome();
		System.out.println("I help keep our patients healthy.");
	}

}
