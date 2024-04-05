import java.util.ArrayList;
import java.util.Scanner;

public class University {
private ArrayList<Student> masterStudentList;
private ArrayList<FacultyMember> masterFacultyList;
private ArrayList<Course> masterCourseList;
private Scanner input = new Scanner(System.in);

	public University(ArrayList<Student> newStudentList, ArrayList<FacultyMember> newFacultyList, ArrayList<Course> newCourseList) {
		this.masterStudentList = newStudentList;
		this.masterFacultyList = newFacultyList;
		this.masterCourseList = newCourseList;
	}

	public void listStudents() {
		for(int i = 0; i < masterStudentList.size(); i++) {
			System.out.println(masterStudentList.get(i).toString());
		}
	}
	public void listFaculty() {
		for(int i = 0; i < masterFacultyList.size(); i++) {
			System.out.println(masterFacultyList.get(i).toString());
		}
	}
	public void listCourses() {
		for(int i = 0; i < masterCourseList.size(); i++) {
			System.out.println(masterCourseList.get(i).toString());
		}
	}
	
	
	public Address createAddress() {
		System.out.println("Lets create an Address...");
		System.out.println("Please enter a street number:");
		int streetNumber = input.nextInt();
		
		System.out.println("Please enter a street name:");
		String streetName = input.next();
		
		System.out.println("Enter a city:");
		String city = input.next();
		
		System.out.println("Enter a state:");
		String state = input.next();
		
		System.out.println("Enter a postal code:");
		int postalCode = input.nextInt();
		
		Address newAddress = new Address(streetNumber, streetName, city, state, postalCode);
		
		return newAddress;
				
	}
	public void createStudentAndAdd() {
		
		Address studentAddress = createAddress();
		
		System.out.println("Please enter the student name:");
		String studentName = input.next();
		
		System.out.println("Please enter the student CIN:");
		int studentCIN = input.nextInt();
		
		
		Student newStudent = new Student(studentAddress, studentName, studentCIN);
		masterStudentList.add(newStudent);
		System.out.println("Student Added.");
	}
	public void createAndAddFaculty(){
		Address facultyAddress = createAddress();
		
		System.out.println("Please enter the employee name:");
		String facultyName = input.next();
		
		System.out.println("Please enter the employee ID:");
		int facultyID = input.nextInt();
		
		FacultyMember newFaculty = new FacultyMember(facultyAddress, facultyName, facultyID);
		masterFacultyList.add(newFaculty);
		System.out.println("Employee Added.");
	}
	
	public void createAndAddCourse(){
		System.out.println("Please enter the course name:");
		String courseName = input.next();
				
		System.out.println("Please enter the course ID:");
		String courseID = input.next();
		
		Course newCourse = new Course(courseName, courseID);
		masterCourseList.add(newCourse);
		System.out.println("Course Added.");
	}
		

	public void deleteStudent () {
		System.out.println("Please enter the sutdent name:");
		String studentName = input.next();
		
		System.out.println("Please enter the student CIN:");
		int studentCIN = input.nextInt();
		
		for(int i = 0 ; i < masterStudentList.size(); i++) {
			if(masterStudentList.get(i).getName().equals(studentName) && masterStudentList.get(i).getCIN() == studentCIN){
					masterStudentList.remove(i);
					System.out.println("Student Removed.");
			}
		}
	}
	
	public void deleteFaculty (){
		System.out.println("Please enter the employee name:");
		String facultyName = input.next();
		
		System.out.println("Please enter the employee ID:");
		int employeeID = input.nextInt();
		
		for(int i = 0 ; i < masterFacultyList.size(); i++) {
			if(masterFacultyList.get(i).getName().equals(facultyName) && masterFacultyList.get(i).getID() == employeeID){
					masterFacultyList.remove(i);
					System.out.println("Employee Removed.");
			}
		}
	}
	
	
	public void deleteCourseStudent () {
		
			System.out.println("Please enter the student name:");
			String studentName = input.next();
			
			System.out.println("Please enter the student CIN:");
			int studentCIN = input.nextInt();
			
			listCourses();
			
			System.out.println("Please enter a course name");
			String courseName = input.next();
			
			System.out.println("Please enter the course ID");
			String courseID = input.next();
			
			for(int i = 0 ; i < masterStudentList.size(); i++) {
				if(masterStudentList.get(i).getName().equals(studentName) && masterStudentList.get(i).getCIN() == studentCIN){	
						masterStudentList.get(i).drop(courseName, courseID);
						System.out.println("Course removed");
				}
			}
		}
	
	public void deleteCourseFaculty() {
		
		System.out.println("Please enter the employee name:");
		String facultyName = input.next();
		
		System.out.println("Please enter the employee ID:");
		int facultyID = input.nextInt();
		
		listCourses();
		
		System.out.println("Please enter a course name:");
		String courseName = input.next();
		
		System.out.println("Please enter the course ID:");
		String courseID = input.next();
		
		for(int i = 0 ; i < masterFacultyList.size(); i++) {
			if(masterFacultyList.get(i).getName().equals(facultyName) && masterFacultyList.get(i).getID() == facultyID){
					masterFacultyList.get(i).drop(courseName, courseID);
					System.out.println("Course removed");
			}
		}
		
	}
	
	public void addCourseStudent() {
		System.out.println("Please enter the student name:");
		String studentName = input.next();
		
		System.out.println("Please enter the student CIN:");
		int studentCIN = input.nextInt();
		
		listCourses();
		
		System.out.println("Please enter a course name:");
		String courseName = input.next();
		
		System.out.println("Please enter the course ID:");
		String courseID = input.next();
		
		for(int i = 0 ; i < masterStudentList.size(); i++) {
			if(masterStudentList.get(i).getName().equals(studentName) && masterStudentList.get(i).getCIN() == studentCIN){	
					for(int j = 0; j < masterCourseList.size(); j++) {
						if(masterCourseList.get(i).getName().equals(courseName) && masterCourseList.get(j).getID().equals(courseID)) {
							masterStudentList.get(i).add(masterCourseList.get(j));
							System.out.println("Course added.");
						}
				}
			}
		}
	}
	
	
	public void addCourseFaculty() {
		System.out.println("Please enter the employee name:");
		String FacultyName = input.next();
		
		System.out.println("Please enter the employee ID:");
		int FacultyID = input.nextInt();
		
		listCourses();
		
		System.out.println("Please enter a course name");
		String courseName = input.next();
		
		System.out.println("Please enter the course ID");
		String courseID = input.next();
		
		for(int i = 0 ; i < masterFacultyList.size(); i++) {
			if(masterFacultyList.get(i).getName().equals(FacultyName) && masterFacultyList.get(i).getID() == FacultyID){	
					for(int j = 0; j < masterCourseList.size(); j++) {
						if(masterCourseList.get(i).getName().equals(courseName) && masterCourseList.get(j).getID().equals(courseID)) {
							masterFacultyList.get(i).add(masterCourseList.get(j));
							System.out.println("Course Added.");
						}
					}
			}
		}
	}
	
	
	public void menu() {
		while(true) {
			System.out.println("1. List Students\n2. List Faculty\n3. List Courses\n4. Create and Add a Student\n5. Create and Add a Faculty Member"
					+ "\n6. Create and Add a Course\n7. Delete a Student\n8. Delete a Faculty Member\n9. Add a Course(Student)\n10. Add a Course(Faculty)"
					+ "\n11. Delete a Course(Student)\n12. Delete a Course(Faculty)\n13. Exit ");
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			switch(choice) {
			case 1: 
				listStudents();
				break;
			case 2: 
				listFaculty();
				break;
			case 3:
				listCourses();
				break;
			case 4:
				createStudentAndAdd();
				break;
			case 5:
				createAndAddFaculty();
				break;
			case 6:
				createAndAddCourse();
				break;
			case 7:
				deleteStudent();
				break;
			case 8:
				deleteFaculty();
				break;
			case 9:
				addCourseStudent();
				break;
			case 10:
				addCourseFaculty();
				break;
			case 11:
				deleteCourseStudent();
				break;
			case 12:
				deleteCourseFaculty();
				break;
			case 13:
				return;
			default:
				System.out.println("That is not a choice");

			}
			
		}
	}
}
