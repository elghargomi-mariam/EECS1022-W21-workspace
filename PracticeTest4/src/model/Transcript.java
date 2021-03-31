package model;

public class Transcript {
	private String name = "";
	private String StudentID = "";
	static int multiple = 3;
	private Registration[] report = {};
	
	public  Transcript(String name) {
		this.name = name;
		this.StudentID = this.name + multiple;
		multiple += 3;
	}
	
	public static int getMultiple() {
		return multiple;
	}
	
	public String getStudentID() {
		return this.StudentID;
	}
	
	public Registration[] getReport() {
		return this.report;
	}
	
	public void addRegistration(Registration registration) {
		Registration[] temp = new Registration[this.report.length + 1];
		for(int i= 0; i < this.report.length + 1; i++) {
			
		}
	}
	
	public void addRegistration(String name, int credits) {
		Registration[] temp = new Registration[this.report.length + 1];
		for(int i= 0; i < this.report.length + 1; i++) {
			
		}
	}
	
	public void addRegistrations(Registration[] registration) {
		Registration[] temp = new Registration[this.report.length + 1];
		for(int i= 0; i < this.report.length + 1; i++) {
			
		}
	}
	
	public int getMarks(String course) {
		return 0;
	}
	
	public void setMarks(String course, int grade) {
		
	}
	
	public double getWeightedGPA() {
		return 0.0;
	}
	
	
}
