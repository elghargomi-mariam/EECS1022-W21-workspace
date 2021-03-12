package model;

public class Registration {
	//Attributes
	private String title = "";
	private int marks = 0;
	private String[] gradeReport =  {"F","Failing"};
	private String information = "";
	Instructor instructor;
	
	
	// Constructors
	public Registration(String title) {
		this.title = title;
		this.information = this.title+" has not yet been assigned an instructor";
	}
	
	public Registration(String title, Instructor instructor) {
		this.title = title;
		this.instructor = instructor;
	}
	
	// Getters
	public String getTitle() {
		return this.title;
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	public String[] getGradeReport() {
		return this.gradeReport;
	}
	
	public String getInformation() {
		if(this.instructor != null) {
			this.information = this.title +", taught by " + this.instructor.getName() + ", is completed with raw marks " + this.marks + " (" + 
		this.gradeReport[0] + " ; " + this.gradeReport[1] + ")";
		}
		
		return this.information;
	}
	
	// Setters
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public void setMarks(int mark) {
		this.marks = mark;
		if(this.marks >= 90 && this.marks <= 100) {
			this.gradeReport[0] = "A+";
			this.gradeReport[1] = "Exceptional";
		}else if(this.marks >= 80 && this.marks <= 89) {
			this.gradeReport[0] = "A";
			this.gradeReport[1] = "Excellent";
		}else if(this.marks >= 70 && this.marks <=79) {
			this.gradeReport[0] = "B";
			this.gradeReport[1] = "Good";
		}else if(this.marks >= 60 && this.marks <= 69) {
			this.gradeReport[0] = "C";
			this.gradeReport[1] = "Competent";
		}else if (this.marks >= 50 && this.marks <= 59) {
			this.gradeReport[0] = "D";
			this.gradeReport[1] = "Passing";
		}else {
			this.gradeReport[0] = "F";
			this.gradeReport[1] = "Failing";
		}
		if(this.instructor != null) {
			this.information = this.title +", taught by " + this.instructor.getName() + ", is completed with raw marks " + this.marks + " (" + 
		this.gradeReport[0] + " ; " + this.gradeReport[1] + ")";
		}
		
	}
	
}
