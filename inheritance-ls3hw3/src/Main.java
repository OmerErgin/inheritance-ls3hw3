public class Main {

	public static void main(String[] args) {
		Instructor instructor1=new Instructor(1, "Engin Demiroğ", "deneme@deneme.com", "123456", 20);
		System.out.println(instructor1.getInstructorNumber());
		System.out.println(instructor1.getEmail());
		
		Course course1 = new Course(11, "Java React", "Kurs açıklaması",instructor1);
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		
		Student student1= new Student(61, "Ömer Ergin", "omererginn@outlook.com", "98765", 22);
		StudentManager studentManager=new StudentManager();
		studentManager.login(student1);
		
		
		UserManager usermanager1 = new UserManager();
		usermanager1.emailUpdate(instructor1, "guncelemail@deneme.com");
		System.out.println(instructor1.getEmail());
		
		courseManager.join(course1, studentManager,student1);;
		
	}

}
