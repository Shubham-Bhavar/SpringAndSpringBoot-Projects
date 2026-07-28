package in.shubham.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("in/shubham/beans/ApplicationContext.xml");

        Student s = (Student) context.getBean("student");
        s.show();
    }
}