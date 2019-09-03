package kr.ac.daelim.UML;

public class Barracks extends Building implements IBuildingMove {
	
	protected String name = "Barrack";
	protected int status = 0;

	@Override
	public void Construct() {
		System.out.println("Barracks construct");
		
	}

	@Override
	public void underAttack(Character character) {
		System.out.println("Barracks underAttack");
		
	}

	public void move() {
		if(status == 1) {
			System.out.println("Barracks move");
		}
	}

	public void land() {
		if(status == 1) {
			System.out.println("Barracks land");
			status = 0;
		}
		
	}

	public void fly() {
		if(status == 0) {
			System.out.println("Barracks fly");
			status = 1;
		}
	}
	

}
