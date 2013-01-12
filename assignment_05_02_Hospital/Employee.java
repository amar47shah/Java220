package assignment_05_02_Hospital;

public class Employee {
	
	protected String title, name;
	protected double salary;
	
	public Employee(String title, String name, Double salary)
	{
		this.title = title;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		String e = "Name: " + name;
		e += "\nTitle: " + title;
		return e;
	}

	public void welcome()
	{
		System.out.println("Hi, I'm " + name + ".");
		System.out.println("Welcome to our hospital.");
		System.out.println("I'm your " + title + ".");
	}
}
