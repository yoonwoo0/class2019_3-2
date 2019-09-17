package kr.ac.daelim.zoo;

public class Tiger extends Animal{

	public Tiger() {
		
		cry = new TigerCry();
		fly = new FlyNoWay();
		swim = new SwimWithLegs();
	}
	
	@Override
	void display() {
		
		System.out.println("호랑이");
	}
	
//	@Override
//	public void performCry() {
//		cry.cry();
//	}
//	
//	@Override
//	public void performFly() {
//		fly.fly();
//	}
}
