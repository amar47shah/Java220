package assignment_04;

import java.util.ArrayList;

public class Course {

	private String courseName;
	private Integer classSize;
	private ArrayList<Student> classMembers = new ArrayList<Student>();
	
	public Course (String name)
	{
		courseName = name;
        classSize = 0;
	}
	
	public Integer size ()
	{
		return classSize;
	}
	
	public void addStudent (Student student)
	{
		classMembers.add(student);
		classSize = classMembers.size();
	}
	
	public Double average ()
	{
		double studentTotal = 0.0;
		for (int i = 0; i < classSize; i++) {
			studentTotal += classMembers.get(i).average();
		}
		return studentTotal / (classSize * 1.0);
	}
	
	public void roll ()
	{
		for (int i = 0; i < classSize; i++) {
			System.out.println (classMembers.get(i).toString() + "\n");
		}
	}
	
	public String toString ()
	{
		return courseName;
	}
}
