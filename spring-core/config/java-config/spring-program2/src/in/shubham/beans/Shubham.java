package in.shubham.beans;

public class Shubham 
{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	private int Roll_no;
	private String Address;
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll_No: "+Roll_no);
		System.out.println("Address: "+Address);
	}
}
