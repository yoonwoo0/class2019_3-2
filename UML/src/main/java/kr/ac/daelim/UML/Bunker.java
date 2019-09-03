package kr.ac.daelim.UML;

public class Bunker extends Building {

	@Override
	public void Construct() {
		System.out.println("Bunker construct");
		
	}

	@Override
	public void underAttack(Character character) {
		System.out.println("Bunker underAttack");
		
	}
	
}
