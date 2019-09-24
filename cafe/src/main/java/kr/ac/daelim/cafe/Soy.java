package kr.ac.daelim.cafe;

public class Soy extends CondimentDecorator{

	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription()+ " +soy";
	}

	@Override
	public double cost() {
		
		return beverage.cost() + 700;
	}
}
