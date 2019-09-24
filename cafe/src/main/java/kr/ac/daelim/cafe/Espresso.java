package kr.ac.daelim.cafe;

public class Espresso extends Beverage{

	public Espresso() {
		this.description = "Espresso";
	}
	
	@Override
	public double cost() {
		
		return 3500;
	}
}
