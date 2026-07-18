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
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private int roll_no;
	private String address;
	
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("roll_no:"+roll_no);
		System.out.println("address:"+address);
		
	}
	
}
