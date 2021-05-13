package eCommerce.dataAcces.abstracts;

import java.util.List;

import eCommerce.entities.concrates.User;

public interface UserDao {

	void add(User user);
    void update(User user);
    void delete(int userId);
    User get(String Email);
    List <User>getAll();
  






}
 
