package MVCdemo;

public class CourseView {
	private Course course;
	
	//constructor
	public CourseView() {
		
	}
	//constructor w/ student
	public CourseView(Course crs) {
		course = crs;
	}
	
	//setter
	public void setCourse(Course crs) {
		course = crs;
	}
	//getter
	public Course getCourse() {
		return course;
	}
	
	//method
	public void printCourse(Course crs) {
		this.setCourse(crs);
		printCourse();
	}
	
	//method w/ student
	public void printCourse() {
		if (course == null) {
			throw new IllegalArgumentException("course");
		}
		else {
			System.out.println(course.getName() + ": " + course.getNum() + " for " + course.getCred() + " credits, with professor " + course.getProf().getFirstName() + " " + course.getProf().getLastName());
		}
	}
}
