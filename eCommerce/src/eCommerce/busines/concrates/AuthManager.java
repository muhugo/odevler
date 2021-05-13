package eCommerce.busines.concrates;

import eCommerce.busines.abstracts.AuthService;
import eCommerce.busines.abstracts.UserService;
import eCommerce.core.Utils;
import eCommerce.entities.concrates.LoginDto;
import eCommerce.entities.concrates.User;

public class AuthManager implements AuthService{
	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.getEmail()) == false
				&& Utils.emailValidate(user.getEmail())) {

			userService.add(user);

		} else {
			System.out.println("Kayýt baþarýsýz");
		}
		
	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 20) {
			User exitsUser = userService.get(user.getEmail());
			exitsUser.setVerify(true);

			userService.update(exitsUser);
			System.out.println("Doðrulandý");
		} else {
			System.out.println("Doðrulanmadý");
		}
	}

	@Override
	public boolean userExists(String email) {
		User user=userService.get(email);
		if (user == null) {
			return false;
		} else {
			System.out.println("Email mevcut." + email);
			return true;
		}
	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());

		if (user != null && user.getPassword().equals(dto.getPassword())) {
			
			System.out.println("baþarýyla giriþ yaptýnýz");

		}else {
			System.out.println("Kullanýcý adý veya þifre yanlýþ");
			}
		}
		public boolean userValidate(User user) {
			if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
					&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
				return true;
			}
			return false;
		}

		public boolean passwordValidate(String password) {

			if (password.length() >= 6) {
				return true;
			} else {
				System.out.println("þifreniz en az 6 karakter olmalý");
				return false;
			}
	}

}
