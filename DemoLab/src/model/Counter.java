package model;

public class Counter {
	
	private int v1; // instance variable/ Attribute or fields or data  
	
	//constructor no arg. 
	public  Counter(){
		this.v1=0;
	}
	// constructor one arg. 
	public Counter(int v3) {
		this.v1= v3;
	}
	
	public int getValue(){
		return this.v1;
	}
	
	
	public void setValue(int v4) {
		
		this.v1=v4;
	}
	
	public void incr() {
//		this.v1++;
//		this.v1= this.v1+1;
		this.v1+=1;
		
	}
	public void incrbyValue(int incrValue) {
		this.v1+=incrValue;
		
	}
	public void decr() {
		this.v1--;
		
	}
	public void decrbyValue(int decrValue) {
		this.v1= this.v1-decrValue;
		
	}
	
	public String toString() {
		String str= "(Counter is "+this.v1+")";
		return str;
	}
	
	
}
