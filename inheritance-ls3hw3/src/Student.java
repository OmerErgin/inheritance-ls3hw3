
public class Student extends User {
	private int studentNumber;

	public Student(int id, String name, String email, String password, int studentNumber) {
		setId(id);
		setName(name);
		setEmail(email);
		setPassword(password);
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
