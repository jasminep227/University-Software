public class Course {
	private String courseName;
	private String courseID;
	
	public Course (String newName, String newCourseID) {
		this.courseName = newName;
		this.courseID = newCourseID;
	}
	
	public String getName(){
		return courseName;
	}
	public String getID(){
		return courseID;
	}
	
	@Override
	public String toString() {
		return "Course Name: " + courseName + "\nCourse ID: " + courseID;
	}
}
