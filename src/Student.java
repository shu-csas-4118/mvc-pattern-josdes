package MVCdemo;

import java.util.ArrayList;

public class Student {
	//state variables
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<CourseController> courses = new ArrayList<CourseController>();
	
	
	//constructor
	public Student(String fn, String ln, String em, int id, ArrayList<CourseController> course) {
		firstName = fn;
		lastName = ln;
		email = em;
		idNumber = id;
		courses = course;
	}
	public Student(String fn, String ln, String em, int id) {
		firstName = fn;
		lastName = ln;
		email = em;
		idNumber = id;
	}
	//getters
	public String getFirst() {
		return firstName;
	}
	public String getLast() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public int getID() {
		return idNumber;
	}
	public ArrayList<CourseController> getCourses() {
		return courses;
	}
	//setters
	public void setFirst(String fn) {
		firstName = fn;
	}
	public void setLast(String ln) {
		lastName = ln;
	}
	public void setEmail(String em) {
		email = em;
	}
	public void setID(int id) {
		idNumber = id;
	}
	public void setCourses(ArrayList<CourseController> course) {
		courses = course;
	}
}
