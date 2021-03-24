package model;

public class Item {
	
	// Attributes
	private String title = "";
	private int amount = 0;
	private String info = "";
	private boolean error = false;
	
	//Constructors
	public Item(String title) {
		this.title = title;
	}
	
	//Getters
	public String getTitle() {
		return this.title;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public String getInfo() {
		if(this.title != "" && this.error == false) {
			this.info = "Item: " + this.title + " (" + this.amount + ")";
		}
		return this.info;
	}
	
	// Setters
	
	public void increaseAmount(int value) {
		if (value <=0) {
			this.error = true;
			this.info = "Error: non-positive amount " + value;
		}
		else{
			this.amount += value;
		}
	}
	
	public void decreaseAmount(int value) {
		int diff = this.amount - value;
		if(value <= 0) {
			this.error = true;
			this.info = "Error: non-positive amount " + value;
		}else if(diff < 0) {
			this.error = true;
			int reverse = value - this.amount;
			this.info = "Error: amount is short of " + reverse;
		}else {
			this.amount -= value;
		}
		
	}
}

