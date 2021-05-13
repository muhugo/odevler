package eCommerce;

import eCommerce.busines.concrates.AuthManager;
import eCommerce.busines.concrates.UserManager;
import eCommerce.core.amazonMail.AmazonMailManagerAdapter;
import eCommerce.core.googleMail.GoogleMailManagerAdater;
import eCommerce.dataAcces.concrates.inMemoryUserDao;
import eCommerce.entities.concrates.User;

public class main {

	public static void main(String[] args) {
	inMemoryUserDao ýnMemoryUserDao=new inMemoryUserDao();
	AuthManager authManager=new AuthManager(new UserManager(ýnMemoryUserDao,new AmazonMailManagerAdapter()));
	
	User enes=new User(2,"Enes","celep","enes@gmail.com","123456",true);
	User zafer=new User(2,"Enes","celep","zafergmail.com","123456",true);
	
	authManager.register(zafer);
	UserManager userManager=new UserManager(ýnMemoryUserDao, new GoogleMailManagerAdater());
	//userManager.update(enes);
	//userManager.delete(3);
	userManager.getAll();
	}

}
