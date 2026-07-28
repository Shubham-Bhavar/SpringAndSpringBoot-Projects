package in.shubham.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private int roll_no;
	private String name;
	private Address address;
	@Autowired
	public Student(int roll_no,String name,Address address)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.address=address;
	}
	@Autowired
	public void display()
	{
		System.out.println("roll_no : "+roll_no);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}
