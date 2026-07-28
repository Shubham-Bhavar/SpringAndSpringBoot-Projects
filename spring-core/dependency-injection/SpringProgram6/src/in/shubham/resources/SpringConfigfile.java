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
		Address add=new Address();
		
		add.setHouseno(100);
		add.setCity("Pune");
		add.setPincode(422605);
		
		return add;
	}
	@Bean
	public Student createStd()
	{
		Student std=new Student();
		std.setRoll_no(8);
		std.setName("Shubham");
		std.setAddress(createAdd());
		
		return std;
	}
}
