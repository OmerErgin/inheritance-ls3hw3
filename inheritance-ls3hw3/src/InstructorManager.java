
public class InstructorManager extends UserManager {
	public void login(Instructor instructor) {
		System.out.println("E�itmen login oldu");
	}
	public void addToUser(Course course,User user) {
		System.out.println("E�itmen "+user.getName()+" Kullan�c�ya kurs atand�");
	}
}
