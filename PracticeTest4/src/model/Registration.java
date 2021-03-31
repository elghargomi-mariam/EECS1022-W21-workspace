package model;

public class Registration {
	private String course = "";
	private int credits = 0;
	private int marks = 0;
	
	public Registration(String course, int credits, int marks) {
		this.course = course;
		this.credits = credits;
		this.marks = marks;
	}
	
	public Registration(String course, int credits) {
		this.course = course;
		this.credits = credits;
	}
	
	public String getCourseName(){
		return this.course;
	}
	
	public int getNumberOfCredits() {
		return this.credits;
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getLetterGrade() {
		if(this.marks >= 90) {
			return "A+";
		}
		return "F";
	}
	
	public int getWeightedGradePoint() {
		if(this.getLetterGrade() == "A+") {
			return 9;
		}
		return 0;
	}
	

}
