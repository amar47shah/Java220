package assignment_05_02_Hospital;

public abstract class NonMedicalEmployee extends Employee {

	public NonMedicalEmployee(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}
	
	public void welcome()
	{
		super.welcome();
		System.out.println("I help the hospital run more smoothly.");
	}

}
