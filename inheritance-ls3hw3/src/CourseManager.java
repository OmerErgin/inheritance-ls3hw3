
public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs başarıyla listeye eklenmiştir.");
	}
	public void delete(Course course) {
		System.out.println("Kurs başarıyla sistemden kaldırılmıştır.");
	}
	public void update(Course course) {
		System.out.println("Kurs bilgileri güncellenmiştir.");
	}
	public void join(Course course,UserManager userManager,User user) {
		System.out.println("Kullanıcı kursa kaydedildi.");
		userManager.addToUser(course,user);
	}
}
