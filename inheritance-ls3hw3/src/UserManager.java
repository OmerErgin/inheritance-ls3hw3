
public class UserManager {
	public void login(User user) {
		System.out.println("Ortak konfigürasyon");
	}
	public void emailUpdate(User user,String email) {
		user.setEmail(email);
	}
	public void addToUser(Course course,User user) {
		System.out.println("Kullanýcýya kurs atandý");
		
	}
	
}
