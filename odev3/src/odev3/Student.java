package odev3;

public class Student extends User {
	private int StudentId;
	private String FirstName;
	private String LastName;

	public Student() {

	}

	public Student(int studentId, String firstName, String lastName) {
		super();
		StudentId = studentId;
		FirstName = firstName;
		LastName = lastName;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
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
