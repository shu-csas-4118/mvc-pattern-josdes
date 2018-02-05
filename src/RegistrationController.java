package MVCdemo;

import java.util.ArrayList;

public class RegistrationController {
	private ArrayList<CourseController> courseList = new ArrayList<CourseController>();
	
	public RegistrationController(ArrayList<CourseController> courses) {
		courseList = courses;
	}
	public RegistrationController() {
		
	}
	public void addCourse(CourseController course) {
		courseList.add(course);
	}
	
	public void addCourse(Course course, ArrayList<CourseController> courses) {
		CourseController temp = new CourseController(course, new CourseView(course));
		courses.add(temp);
	}
	
	public void printCourseList() {
		for(int i = courseList.size(); !(i == 0); i--) {
			courseList.get(i).printCourse();
		}
	}
	
	public void register(Student student, Course course) throws Exception {
		for(int i = courseList.size(); !(i==0); i--) {
			if(courseList.get(i).getCourse().getNum() == course.getNum()) {
				ArrayList<CourseController> temp = student.getCourses();
				temp.add(courseList.get(i));
				student.setCourses(temp);
			}
			else {
				throw new Exception("Course number is not valid");
			}
		}
	}
}
