package in.shubham.main.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.shubham.main.entities.User;

public interface UserInterface extends CrudRepository<User, Integer> {

    List<User> findByCity(String city);
    
    @Query("SELECT u FROM User u")
    List<User> getAllUsersJPQL();

    // Native Query
    @Query(value = "SELECT * FROM users", nativeQuery = true)
    List<User> getAllUsersNative();
}