package model;

public class Instructor {
	
	//Attributes
	private String  name = "";
	private int phoneExtension = 0;
	private String email = "";
	private String information = "";
	
	// Constructors
	public Instructor(String name, int phoneExtension, String email) {
		this.name = name;
		this.email = email;
		this.phoneExtension = phoneExtension;
		this.information = "Instructor " + this.name +" has campus phone extension " + this.phoneExtension + " and contact email " + this.email;
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public int getPhoneExtension() {
		return this.phoneExtension;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getInformation() {
		this.information = "Instructor " + this.name +" has campus phone extension " + this.phoneExtension + " and contact email " + this.email;
		return this.information;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneExtension(int phoneExtension) {
		this.phoneExtension = phoneExtension;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
