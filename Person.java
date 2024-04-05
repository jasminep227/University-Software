import java.util.ArrayList;
import java.util.Scanner;


public class Person {
	private Address personAddress;
	private String personName;
	private Scanner input = new Scanner(System.in);
	
	public Person(Address newPersonAddress, String newPersonName) {
		this.personAddress = newPersonAddress;
		this.personName = newPersonName;
	}
	public String getName() {
		return personName;
	}
	
	public Address getAddress() {
		return personAddress;
	}
	
	
}


class Student extends Person{
	private int studentCIN;
	private ArrayList<Course> courseSchedule;
	
	public Student(Address newPersonAddress, String newPersonName, int newStudentCIN) {
		super(newPersonAddress, newPersonName);
		this.studentCIN = newStudentCIN;
		this.courseSchedule = new ArrayList<Course>();
	}
	
	public int getCIN() {
		return studentCIN;
	}
	
	public ArrayList<Course> getSchedule(){
		return courseSchedule;
	}
	
	public void printSchedule(ArrayList<Course> aSchedule) {
		for(int i = 0; i < aSchedule.size(); i++) {
			System.out.println(aSchedule.get(i).getName());
		}
	}
	
	
	public void drop(String courseName, String courseID){
		for(int i = 0; i < courseSchedule.size(); i++) {
			if(courseSchedule.get(i).getName().equals(courseName) && courseSchedule.get(i).getID().equals(courseID)){
				courseSchedule.remove(i);
			}
			else {
				System.out.println("That is not an existing course");
			}
		}
	}
	public void add(Course coCourse){
		courseSchedule.add(coCourse);
	}
	
	@Override
	public String toString() {
		return "Student Name: " + getName() + "\nStudent CIN: " + studentCIN + "\nAddress: \n" + getAddress().toString() + "\nSchedule: \n" + getSchedule();
}
}


class FacultyMember extends Person{
	private int employeeID;
	private ArrayList <Course> teachingSchedule;
	private Scanner input = new Scanner(System.in);
	
	public FacultyMember(Address newPersonAddress, String newPersonName, int newEmployeeID) {
		super(newPersonAddress, newPersonName);
		this.employeeID = newEmployeeID;
		this.teachingSchedule = new ArrayList <Course>();
	}
	
	public int getID() {
		return employeeID;
	}
	
	public ArrayList<Course> getSchedule(){
		return teachingSchedule;
	}
	
	public void drop(String courseName, String courseID){
		for(int i = 0; i < teachingSchedule.size(); i++) {
			if(teachingSchedule.get(i).getName().equals(courseName) && teachingSchedule.get(i).getID().equals(courseID)){
				teachingSchedule.remove(i);
			}
			else {
				System.out.println("That is not an existing course");
			}
		}
	}
	public void add(Course coCourse){
		teachingSchedule.add(coCourse);
	}
	
	@Override
	public String toString() {
		return "Faculty Name: " + getName() + "\nFaculty ID: " + employeeID + "\nAddress: \n" + getAddress().toString() + "\nSchedule: \n" + getSchedule();
	}
}
