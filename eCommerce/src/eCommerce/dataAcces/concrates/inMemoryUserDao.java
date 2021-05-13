package eCommerce.dataAcces.concrates;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAcces.abstracts.UserDao;
import eCommerce.entities.concrates.User;

public class inMemoryUserDao implements UserDao {
	
	private List<User> users=new ArrayList<User>();
	 public inMemoryUserDao() {
		 User user1=new User(1,"Ali","Alt˝n","ali@email.com","123456",true);
		 User user2=new User(2,"Veli","G¸m¸˛","veli@email.com","123456",true);
		 User user3=new User(3,"Can","Bronz","can@email.com","7894",true);
		 users.add(user1);
		 users.add( user2);
		 users.add(user3);
	 }

	@Override
	public void add(User user) {
	System.out.println("Kaydedildi  :"+ user.getEmail());
	users.add(user);
		
	}

	@Override
	public void update(User user) {
	User userUpdate=users.stream()
			.filter(u->u.get›d()==user.get›d())
			.findFirst()
			.orElse(null);
	userUpdate.setEmail(user.getEmail());
	userUpdate.setFirstName(user.getFirstName());
	userUpdate.setLastName(user.getLastName());
	userUpdate.setPassword(user.getPassword());
	userUpdate.setVerify(user.IsVerify());
	}

	@Override
	public void delete(int userId) {
		User userToDelete=users.stream()
				.filter(u->u.get›d()==userId)
				.findFirst()
				.orElse(null);
		users.remove(userToDelete);
		
	}
	@Override
	public List<User>getAll() {
		
		return users;
	}

	@Override
	public User get(String Email) {
		User user=users.stream()
				.filter(u->u.getEmail()== Email)
				.findFirst()
				.orElse(null);
		return user;
	}

	

	
		
	}


