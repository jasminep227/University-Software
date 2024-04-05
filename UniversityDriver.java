import java.util.ArrayList;


public class UniversityDriver {
	
	public static void main (String[] args) {
		
		ArrayList<Student> students = new ArrayList <Student>();
		ArrayList<FacultyMember> staff = new ArrayList<FacultyMember>();
		ArrayList<Course> classes = new ArrayList<Course>();
		
		University newUni = new University(students, staff, classes);
		newUni.menu();
		
	}
}
