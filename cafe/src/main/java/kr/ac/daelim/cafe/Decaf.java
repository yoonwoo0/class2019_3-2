package kr.ac.daelim.cafe;

public class Decaf extends Beverage{

	public Decaf() {
		this.description = "Decaf";
	}
	
	@Override
	public double cost() {
		
		return 4500;
	}
}
