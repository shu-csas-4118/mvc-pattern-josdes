package MVCdemo;

import java.util.ArrayList;

public class MVCdemo {

	public static void main(String[] args) {
		Professor prof1 = new Professor("Mr.", "HELPIMSTUCKINTHESYSTEM", "email", 2014700938);
		Professor prof2 = new Professor("Mr. ", "waitItsOkayTheresWifi", "email", 2013820837);
		ArrayList<Course> courses = new ArrayList<Course>();
		Course demoCourse0 = new Course("English?", 102934, 3.0, prof1);
		Course demoCourse1 = new Course("English.", 108938, 3.2, prof2);
		courses.add(demoCourse0);
		courses.add(demoCourse1);
		Student std = new Student("Freddy", "Billards", "billarfr@shu.edu", 112067);
		StudentView stdView = new StudentView();
		StudentController penicillin = new StudentController(std, stdView);
		
		penicillin.printStudentDetails();
	}

}
