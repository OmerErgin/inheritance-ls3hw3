
public class StudentManager extends UserManager {
	public void login(Student student) {
		System.out.println("��renci login oldu");
	}
	public void addToUser(Course course,User user) {
		System.out.println("��renci "+user.getName()+" Kullan�c�ya kurs atand�");
	}
}
