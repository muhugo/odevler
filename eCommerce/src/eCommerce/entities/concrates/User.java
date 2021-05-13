package eCommerce.entities.concrates;

import eCommerce.entities.abstracts.Entity;

public class User implements Entity{

	int ›d;
	String FirstName;
	String LastName;
	String Email;
	String Password;
	boolean Verify;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String email, String password,boolean verify) {
		super();
		›d = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		Verify=verify;
	}

	public int get›d() {
		return ›d;
	}

	public void set›d(int id) {
		›d = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public boolean IsVerify() {
		return Verify;
	}

	public void setVerify(boolean verify) {
		Verify = verify;
	}
	
	
	
	
	
}
