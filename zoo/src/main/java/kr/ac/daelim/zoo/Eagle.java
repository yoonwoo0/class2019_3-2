package kr.ac.daelim.zoo;

public class Eagle extends Animal{

	public Eagle() {
		
		cry = new BirdCry();
		fly = new FlyWithWings();
		swim = new SwimNoWay();
	}
	
	@Override
	void display() {
		
		System.out.println("독수리");
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
