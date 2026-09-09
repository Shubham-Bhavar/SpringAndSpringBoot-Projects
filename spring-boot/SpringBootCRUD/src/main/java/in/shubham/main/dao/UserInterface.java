package in.shubham.main.dao;

import org.springframework.data.repository.CrudRepository;
import in.shubham.main.entities.User;

public interface UserInterface extends CrudRepository<User, Integer> {

}