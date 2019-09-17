package kr.ac.daelim.zoo;

public abstract class Animal {
	
	
	iCry cry;
	iFly fly;
	iSwim swim;
	
	public Animal() {
	}
	
	abstract void display();
	
	public void move() {
		System.out.println("움직임");
	}
	
	public void performCry() {
		
		cry.cry();
	}
	
	public void performFly() {
		
		fly.fly();
	}
	
	public void performSwim() {
		
		swim.swim();
	}
}
