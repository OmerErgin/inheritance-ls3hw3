
public class UserManager {
	public void login(User user) {
		System.out.println("Ortak konfig�rasyon");
	}
	public void emailUpdate(User user,String email) {
		user.setEmail(email);
	}
	public void addToUser(Course course,User user) {
		System.out.println("Kullan�c�ya kurs atand�");
		
	}
	
}
