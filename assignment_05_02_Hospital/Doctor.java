package assignment_05_02_Hospital;

public class Doctor extends MedicalEmployee {

	public Doctor(String title, String name, Double salary) 
	{
		super(title, name, salary);
	}

	public void diagnose()
	{
		System.out.println("Vell, vaht seems to be da trahble?");
	}
}
