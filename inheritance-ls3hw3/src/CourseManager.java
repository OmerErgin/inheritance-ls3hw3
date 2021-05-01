
public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs ba�ar�yla listeye eklenmi�tir.");
	}
	public void delete(Course course) {
		System.out.println("Kurs ba�ar�yla sistemden kald�r�lm��t�r.");
	}
	public void update(Course course) {
		System.out.println("Kurs bilgileri g�ncellenmi�tir.");
	}
	public void join(Course course,UserManager userManager,User user) {
		System.out.println("Kullan�c� kursa kaydedildi.");
		userManager.addToUser(course,user);
	}
}
