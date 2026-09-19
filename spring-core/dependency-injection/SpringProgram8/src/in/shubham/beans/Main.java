package in.shubham.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.shubham.resources.SpringConfigfile;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigfile.class);
		Student std=(Student) context.getBean(Student.class);
		std.display();
	}
}
