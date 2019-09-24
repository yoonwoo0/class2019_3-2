package kr.ac.daelim.cafe;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		this.description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		
		return 3900;
	}
}
