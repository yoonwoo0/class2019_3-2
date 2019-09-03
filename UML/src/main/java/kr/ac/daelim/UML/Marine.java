package kr.ac.daelim.UML;

public class Marine extends Unit {
	protected int attackPower;
	public void move() {
		System.out.println("마린 move");
	}
	
	public void attack() {
		System.out.println("마린 attack");
	}

	public void underAttack(Character character) {
		System.out.println("마린 underAttack");
	}
}
