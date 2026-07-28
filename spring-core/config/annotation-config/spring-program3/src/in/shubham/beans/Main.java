package in.shubham.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		String resource_file_path = "applicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
		
		Shubham std = (Shubham) context.getBean("shubham");
		
		std.display();
		
	}
}