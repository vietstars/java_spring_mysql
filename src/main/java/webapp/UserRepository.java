package webapp;

import org.springframework.data.repository.CrudRepository;

import webapp.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}