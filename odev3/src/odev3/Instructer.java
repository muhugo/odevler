package odev3;

public class Instructer extends User {
	private int InstructerId;
	private String FirstName;
	private String LastName;
	 
	public Instructer() {
		
	}

	public Instructer(int instructerId, String firstName, String lastName) {
		super();
		InstructerId = instructerId;
		FirstName = firstName;
		LastName = lastName;
	}

	public int getInstructerId() {
		return InstructerId;
	}

	public void setInstructerId(int instructerId) {
		InstructerId = instructerId;
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

		
}
	
	
	
	
