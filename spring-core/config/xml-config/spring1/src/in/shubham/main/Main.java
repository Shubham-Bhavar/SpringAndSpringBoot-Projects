package in.shubham.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.shubham.beans.Shubham;

public class Main {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("in/shubham/resources/applicationContext.xml")) {

            Shubham std = (Shubham) context.getBean("std1");
            std.display();
        }
    }
}