package in.shubham.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Address 
{
	private int houseno;
	private String city;
	private int pincode;
	@Autowired
	public Address(int houseno,String city,int pincode)
	{
		this.houseno=houseno;
		this.city=city;
		this.pincode=pincode;
	}
	
	public String toString()
	{
		return "#"+houseno+"#"+city+"#"+pincode;
	}
}
