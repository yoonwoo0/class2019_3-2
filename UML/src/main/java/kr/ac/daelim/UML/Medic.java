package kr.ac.daelim.UML;

public class Medic extends Unit{
	
	public void move() {
		System.out.println("메딕 move");
	}
	
	public void healing(Character character) {
		System.out.println("메딕 healing");
	}

	public void underAttack(Character character) {
		System.out.println("메딕 underAttack");
	}
}
