package in.sp.beans;

public class Student 
{
	private int roll_no;
	private String name;
	private Address address;
	
	public Student(int roll_no,String name,Address address)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Roll_No : "+roll_no);
		System.out.println("Student_Name : "+name);
		System.out.println("Address : "+address);
	}
}
