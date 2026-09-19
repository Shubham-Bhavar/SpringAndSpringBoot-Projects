package in.shubham.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.shubham.main.dao.UserInterface;
import in.shubham.main.entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringBootJpaApplication.class, args);

        UserInterface userInterface =
                context.getBean(UserInterface.class);

        User user = new User();

        user.setName("Pratik");
        user.setCity("Beed");
        user.setStatus("active");

        User user1 = userInterface.save(user);

        System.out.println(user1);
    }
}