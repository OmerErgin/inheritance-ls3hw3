
public class StudentManager extends UserManager {
	public void login(Student student) {
		System.out.println("Öðrenci login oldu");
	}
	public void addToUser(Course course,User user) {
		System.out.println("Öðrenci "+user.getName()+" Kullanýcýya kurs atandý");
	}
}
