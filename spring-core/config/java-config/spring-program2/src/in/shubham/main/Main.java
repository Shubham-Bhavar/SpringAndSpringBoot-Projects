package in.shubham.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.shubham.beans.Shubham;
import in.shubham.resources.SpringConfigfile;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigfile.class);
		
		Shubham std1=(Shubham) context.getBean("bean1");
		std1.display();
		System.out.println("---------------------------------------------");
		Shubham std2=(Shubham) context.getBean("bean2");
		std2.display();
 		
	}
}
