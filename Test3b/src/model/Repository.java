package model;

public class Repository {
	// Attributes
	private int maxNum= 0;
	private Item[] items = {};
	
	//Constructors
	public Repository(int numOfTitles) {
		this.maxNum = numOfTitles;
	}
	
	//Getters
	public Item[] getItems() {
		return this.items;
	}
	
	public Item[] getItems(String[] titles) {
		int counter = 0;
		for(int m  = 0; m < titles.length; m ++) {
			for(int i = 0; i< this.items.length; i++) {
				if(this.items[i].getTitle() ==titles[m] ) {
					counter += 1;
				}
			}
		}
		Item[] temp = new Item[counter];
		int counter2 = 0;
		for(int n  = 0; n < titles.length; n ++) {
			for(int j = 0; j< this.items.length; j++) {
				if(this.items[j].getTitle() ==titles[n] ) {
					temp[counter2] = this.items[j];
					counter2 += 1;
				}
			}
		}
		this.items= temp;
		return this.items;
	}
	
	public Item[] getItemsOutsideRange(int upper, int lower) {
		int counter = 0;
		for(int i = 0; i < this.items.length; i++) {
			if(this.items[i].getAmount() > upper || this.items[i].getAmount() < lower) {
				counter += 1;
			}
		}
		Item[] temp = new Item[counter];
		int counter2 = 0;
		for(int j = 0; j < this.items.length; j++) {
			if(this.items[j].getAmount() > upper || this.items[j].getAmount() < lower) {
				temp[counter2] = this.items[j];
				counter2 += 1;
			}
		}
		this.items = temp;
		return this.items;
	}
	
	public int getAmount(String item) {
		int result = -1;
		for(int i = 0; i < this.items.length; i++) {
			if(this.items[i].getTitle() == item) {
				result = this.items[i].getAmount();
			}
		}
		return result;
	}
	
	// Setters
	public void addItem(Item item) {
		int newLength = this.items.length + 1;
		boolean flag = false;
		for(int j = 0; j < this.items.length; j ++) {
			if(this.items[j].getTitle() == item.getTitle()){
				flag = true;
				this.items[j].increaseAmount(item.getAmount());
			}
		}
		
		if(newLength <= this.maxNum && flag == false) {
			Item[] temp = new Item[newLength];
			for(int i = 0; i <temp.length; i++) {
				if(i < this.items.length) {
					temp[i] = this.items[i];
				}else {
					temp[i] = item;
				}
			}
			this.items = temp;
		}
		
	}
	
	public void decreaseAmount(String title, int num) {
		for (int i = 0; i< this.items.length; i++) {
			if(this.items[i].getTitle() == title) {
				this.items[i].decreaseAmount(num);
			}
		}
	}
}
