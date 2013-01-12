package assignment_05_02_Hospital;

public class Nurse extends MedicalEmployee {

	public Nurse(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}
	
	public void vaccinate()
	{
		System.out.println("Hold still. This will hurt a little.");
	}

}
