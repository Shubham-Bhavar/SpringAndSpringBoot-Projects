package in.shubham.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {

        // XML file load करतो
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Bean घेतो
        Student student = (Student) context.getBean("student");

        System.out.println(student);
    }
}