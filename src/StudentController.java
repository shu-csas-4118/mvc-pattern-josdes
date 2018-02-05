package MVCdemo;

public class StudentController {
	private StudentView studentView;
	private Student student;
	
	public StudentController(Student std, StudentView stdView) {
		studentView = stdView;
		student = std;
	}
	
	public void printStudentDetails() {
		studentView.printStudent(student);
	}
}
