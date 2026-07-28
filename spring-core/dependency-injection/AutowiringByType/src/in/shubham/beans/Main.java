package in.shubham.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("in/shubham/beans/ApplicationContext.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}