package in.shubham.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shubham
{
	@Value("Shubham")
	String name;
	@Value("08")
	int Roll_No;
	@Value("92.00f")
	float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll_No: "+Roll_No);
		System.out.println("Marks: "+marks);
	}
}
