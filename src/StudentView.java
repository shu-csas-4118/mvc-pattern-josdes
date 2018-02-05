package MVCdemo;

import java.util.ArrayList;

public class StudentView {
	private Student student;
	
	//constructor
	public StudentView() {
		
	}
	//constructor w/ student
	public StudentView(Student std) {
		student = std;
	}
	
	//setter
	public void setStudent(Student std) {
		student = std;
	}
	//getter
	public  Student getStudent() {
		return student;
	}
	
	//method
	public void printStudent(Student std) {
		this.setStudent(std);
		printStudent();
	}
	
	public void printCourseList(ArrayList<CourseController> courseList) {
		for(int i = courseList.size(); !(i == 0); i--) {
			courseList.get(i).printCourse();
		}
	}
	
	//method w/ student
	public void printStudent() {
		if (student == null) {
			throw new IllegalArgumentException("student");
		}
		else {
			System.out.println(student.getFirst() + " " + student.getLast() + " : " + student.getID());
			System.out.println("They are registered in the folloeing courses");
			printCourseList(student.getCourses());
		}
	}
}
