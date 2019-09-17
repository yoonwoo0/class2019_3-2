package kr.ac.daelim.zoo;

public class Turtle extends Animal{
	
	public Turtle() {
			
		cry = new CryNoWay();
		fly = new FlyNoWay();
		swim = new SwimWithLegs();
	}
	
	@Override
	void display() {
		
		System.out.println("거북이");
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
//	
//	@Override
//	public void performSwim() {
//		swim.swim();
//	}

}
