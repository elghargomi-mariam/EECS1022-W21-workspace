package model;

public class Participant {
	//Attributes
	private String name = "";
	Registration[] registrations = {};
	private String gpaReport = "No GPA available yet for " + this.name;
	private int MAX_NUM_REGISTRATION = 5;
	
	// Constructors
	public Participant(String name) {
		this.name = name;
	}
	
	// Getters
	public Registration[] getRegistrations() {
		return this.registrations;
	}
	
	public String getGPAReport() {
		if(this.registrations.length == 0) {
			this.gpaReport = "No GPA available yet for " + this.name;
		}else {
			String result = this.name + "'s GPA of {";
			double average = 0.0;
			for(int i =0; i< this.registrations.length; i ++) {
				result += convert(this.registrations[i].getMarks());
				average += convert(registrations[i].getMarks());
				result += " (";
				result += this.registrations[i].getGradeReport()[0];
				result += ")";
				if(i < this.registrations.length -1) {
					result += ", ";
				}
			}
			average = average / (this.registrations.length);
			String format = "";
			format = String.format("%.1f", average);
			result += "}: " + format;
			this.gpaReport = result;
		}
		
		return this.gpaReport;
	}
	private int convert(int mark) {
		if(mark >= 90 && mark <= 100) {
			return 9;
		}else if(mark >= 80 && mark <= 89) {
			return 8;
		}else if(mark >= 70 && mark <=79) {
			return 7;
		}else if(mark >= 60 && mark <= 69) {
			return 6;
		}else if (mark >= 50 && mark <= 59) {
			return 5;
		}else {
			return 0;
		}
	}
	
	public int marksOf(String title) {
		int result = -1;
		for(int i = 0; i < this.registrations.length; i++ ) {
			if(registrations[i].getTitle() == title) {
				result = registrations[i].getMarks();
			}
		}
		return result;
	}
	
	// Setters
	public void addRegistration(Registration registration) {
		int newLength = this.registrations.length + 1;
		if(newLength <= this.MAX_NUM_REGISTRATION) {
			Registration[] temp = new Registration[newLength];
			for(int i =0; i < temp.length; i++) {
				if(i < this.registrations.length) {
					temp[i] = this.registrations[i];
				}else {
					temp[i] = registration;
				}
			}
			this.registrations = temp;
			}
		
	}
	
	public void addRegistration(String registration) {
		int newLength = this.registrations.length + 1;
		if(newLength <= this.MAX_NUM_REGISTRATION) {
			Registration[] temp = new Registration[newLength];
			for(int i =0; i < temp.length; i++) {
				if(i < this.registrations.length) {
					temp[i] = this.registrations[i];
				}else {
					Registration register = new Registration(registration);
					temp[i] = register;
				}
			}
			this.registrations = temp;
		}
	}
	
	public void updateMarks(String title, int mark) {
		for(int i = 0; i <this.registrations.length; i++ ) {
			if(registrations[i].getTitle() == title) {
				registrations[i].setMarks(mark);
			}
		}
	}
	
	public void clearRegistrations() {
		Registration[] empty = {};
		this.registrations = empty;
	}
	
}
