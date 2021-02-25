package model;

public class VendingMachine {
	
//	// Attributes
	private String status = "";
	private String stock = "Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)";
	private String[] stockList = {"Coke", "0", "Orange Juice", "0", "Kitkat Chunky Bar", "0", "Lay's Classic Chips", "0"};
	
	
//	// Constructors
	
	public VendingMachine() {
		// do nothing
	}
	

//// Getters
	public String checkStatus() {
		if (this.stock == "Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)") {
			this.status = "Empty VM Started";
		}
		return this.status;
	}
	
	public String checkStock() {
		return this.stock;
	}
	public String checkStock(String item) {
		String result = "";
		String quantity = "";
		for (int i = 0; i < this.stockList.length;i++) {
			if (this.stockList[i] == item) {
				quantity = this.stockList[i + 1];
			}
		}
		result = item + " (" + quantity + ")";
		if(item != "Coke" && item != "Orange Juice" && item != "Kitkat Chunky Bar" && item != "Lay's Classic Chips") {
		result = "Invalid product: " + item;
	}
		return result;
	}
	
	
//	//Setters
	public void add(String item, int quantity) {
		String more = "";
		for (int i = 0; i < this.stockList.length;i++) {
			if (this.stockList[i] == item) {
					more = Integer.toString((Integer.parseInt(this.stockList[i + 1]) + quantity));
					this.stockList[i + 1] = more;
			}
		}
		this.stock = "Stock:";
		for (int j = 0; j < this.stockList.length;j++) {
			this.stock += " ";
			if(j == 1 || j == 3 || j == 5 || j == 7) {
				stock += "(";
			}
			this.stock += this.stockList[j];
			if(j == 1 || j == 3 || j == 5 || j == 7){
				stock += ")";
			}
			if(j == 1 || j == 3 || j == 5) {
				stock += ",";
			}
		this.status = "Product added: " + item + " (" + quantity +  ")";
	}
		if(item != "Coke" && item != "Orange Juice" && item != "Kitkat Chunky Bar" && item != "Lay's Classic Chips") {
		this.status = "Invalid product: " + item;
	}
	}
	
	public void dispense(String item, int quantity) {
		String left = "0";
		for (int i = 0; i < this.stockList.length;i++) {
			if (this.stockList[i] == item) {
				if (quantity <= Integer.parseInt(this.stockList[i + 1])) {
					left = Integer.toString((Integer.parseInt(this.stockList[i + 1]) - quantity));
					this.stockList[i + 1] = left;
			}
	}
			this.status = "Product removed: " + item + " (" + quantity + ")";
			this.stock = "Stock:";
			for (int j = 0; j < this.stockList.length;j++) {
				this.stock += " ";
				if(j == 1 || j == 3 || j == 5 || j == 7) {
					stock += "(";
				}
				this.stock += this.stockList[j];
				if(j == 1 || j == 3 || j == 5 || j == 7) {
					stock += ")";
				}
				if(j == 1 || j == 3 || j == 5) {
					stock += ",";
				}
			}
		}
		if(item != "Coke" && item != "Orange Juice" && item != "Kitkat Chunky Bar" && item != "Lay's Classic Chips") {
		this.status = "Invalid product: " + item;
	}
	}
}
			

