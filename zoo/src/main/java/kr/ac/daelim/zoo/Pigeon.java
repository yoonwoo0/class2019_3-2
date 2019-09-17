package kr.ac.daelim.zoo;

public class Pigeon extends Animal{

	public Pigeon() {
			
		cry = new BirdCry();
		fly = new FlyWithWings();
		swim = new SwimNoWay();
	}
	
	@Override
	void display() {
		
		System.out.println("비둘기");
	}
	
	@Override
	public void performCry() {
		cry.cry();
	}
	
	@Override
	public void performFly() {
		fly.fly();
	}
	
}
