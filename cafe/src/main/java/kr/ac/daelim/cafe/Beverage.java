package kr.ac.daelim.cafe;

public abstract class Beverage {
	
	public double cost;
	public String description;
	
	public String Beverage() {
		return description;
	}
	
	public String getDescription() {
		
		return this.description;
	}
	
	public abstract double cost();
	
	
}
