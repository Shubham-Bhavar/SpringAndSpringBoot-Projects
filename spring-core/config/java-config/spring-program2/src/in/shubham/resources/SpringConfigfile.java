package in.shubham.resources;
import in.shubham.resources.*;
import in.shubham.beans.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringConfigfile 
{
	@Bean("bean1")
	public Shubham std1()
	{
		Shubham std=new Shubham();
		std.setName("shubham");
		std.setRoll_no(8);
		std.setAddress("Ahilyanagr");
		
		return std;
	}
	@Bean("bean2")
	public Shubham std2()
	{
		Shubham std=new Shubham();
		std.setName("Abhijeet");
		std.setRoll_no(1);
		std.setAddress("Shirdi");
		
		return std;
	}
}
