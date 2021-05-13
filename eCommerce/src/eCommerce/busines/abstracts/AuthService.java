package eCommerce.busines.abstracts;

import eCommerce.entities.concrates.LoginDto;
import eCommerce.entities.concrates.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user,String token);
	boolean userExists(String email);
	void login(LoginDto dto);

}
