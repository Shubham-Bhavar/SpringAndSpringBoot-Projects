package in.shubham.restapi.service;

import in.shubham.restapi.entity.User;
import in.shubham.restapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return repository.findById(id);
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public Optional<User> updateUser(Integer id, User newUser) {
        return repository.findById(id).map(existingUser -> {
            existingUser.setName(newUser.getName());
            existingUser.setCity(newUser.getCity());
            return repository.save(existingUser);
        });
    }

    public boolean deleteUser(Integer id) {
        if (!repository.existsById(id)) {
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}
