package in.shubham.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.shubham.beans.Address;
import in.shubham.beans.Student;

@Configuration
public class SpringConfigfile 
{
	@Bean
	public Address createAdd()
	{
		Address add=new Address(100,"Pune",422605);
		
		return add;
	}
	@Bean
	public Student createStd()
	{
		Student std=new Student(8,"Shubham",createAdd());
		
		return std;
	}
}
