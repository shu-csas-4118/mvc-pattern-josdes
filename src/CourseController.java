package MVCdemo;

import java.util.ArrayList;

public class CourseController {
	private CourseView courseView;
	private Course course;
	
	public CourseController(Course crs, CourseView crsView) {
		courseView = crsView;
		course = crs;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public CourseView getView() {
		return courseView;
	}
	public void printCourse() {
		courseView.printCourse(course);
	}
	
}
