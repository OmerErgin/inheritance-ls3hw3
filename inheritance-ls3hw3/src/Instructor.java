
public class Instructor extends User {
	private int instructorNumber;
	

	
	public Instructor(int id, String name, String email, String password, int instructorNumber) {
		setId(id);
		setName(name);
		setEmail(email);
		setPassword(password);
		this.instructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
}
