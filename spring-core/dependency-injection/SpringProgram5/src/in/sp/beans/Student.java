package in.sp.beans;

public class Student 
{
	private int roll_no;
	private String name;
	private Address address;
	
	
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Roll_No : "+roll_no);
		System.out.println("Student_Name : "+name);
		System.out.println("Address : "+address);
	}
}
