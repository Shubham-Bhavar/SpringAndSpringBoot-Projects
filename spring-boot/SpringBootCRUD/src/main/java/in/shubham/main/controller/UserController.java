package in.shubham.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.shubham.main.dao.UserInterface;
import in.shubham.main.entities.User;

@RestController
public class UserController {

    @Autowired
    private UserInterface userInterface;

    // CREATE
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userInterface.save(user);
    }

    // READ ALL
    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userInterface.findAll();
    }

    // READ BY ID
    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return userInterface.findById(id);
    }

    // UPDATE
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id,
                           @RequestBody User newUser) {

        User user = userInterface.findById(id).orElse(null);

        if (user != null) {

            user.setName(newUser.getName());
            user.setCity(newUser.getCity());
            user.setStatus(newUser.getStatus());

            return userInterface.save(user);
        }

        return null;
    }

    // DELETE
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {

        if (userInterface.existsById(id)) {

            userInterface.deleteById(id);

            return "User deleted successfully";
        }

        return "User not found";
    }
}