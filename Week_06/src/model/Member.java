package model;

/*
 * Template for member objects
 */
public class Member {
	/*
	 * Attributes (class-level variable; all methods can access them)
	 */
	// private variables are only accessible within the current class
	// for other classes to access these private variables, call a public accessor method.
	private int id;
	private char type; // 's' for silver, 'b' for bronze (10% discount rate on facilities), 'g' for gold (15%)
	private double balance;
	
	private String name;
	
	private double weight;
	private double height;
	
	/*
	 * Constructors (create instances of the current class)
	 */
	public Member() {
		
	}
	public Member(int id, char type, double balance) {
		this.id = id; //L.H.S : this.id is the attribute 'id'. RHS: parameter
		this.type= type;
		this.balance = balance;
	}
	public Member(String name, int id, char type, double balance) {
		this(id, type, balance); // calling another constructor Member(int, char, double)
		this.name = name;
	}
	
	public Member(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	/*
	 * Accessor Methods (returning some useful information)
	 */
	public double getWeight() {
		return this.weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getBMIReport() {
		String result = "";
		double heightInMeters = this.height /100;
		 double bmi = this.weight/ (heightInMeters * heightInMeters);
		 String interpretation = "";
		 if (bmi < 18.5) {
			 interpretation = "Underweight";
		 }else if (bmi < 25.0) {
			 interpretation = "Normal";
		 }else if (bmi < 03.0) {
			 interpretation = "Overweight";
		 }else {
			 interpretation = "Obese";
		 }
		 result = interpretation + "(" + String.format("%.1f", bmi) + ")";
		
		return result;
	}
	/*
	 * Mutator Methods (not returning anything; modifying attributes)
	 */
	public void changeWeightBy(double units) {
		this.weight += units;
	}
}
