
public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs baþarýyla listeye eklenmiþtir.");
	}
	public void delete(Course course) {
		System.out.println("Kurs baþarýyla sistemden kaldýrýlmýþtýr.");
	}
	public void update(Course course) {
		System.out.println("Kurs bilgileri güncellenmiþtir.");
	}
	public void join(Course course,UserManager userManager,User user) {
		System.out.println("Kullanýcý kursa kaydedildi.");
		userManager.addToUser(course,user);
	}
}
