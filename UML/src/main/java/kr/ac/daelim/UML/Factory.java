package kr.ac.daelim.UML;

public class Factory extends Building implements IBuildingMove{

	protected String name = "Factory";
	protected int status = 0;
	
	@Override
	public void Construct() {
		System.out.println("Factory construct");
		
	}

	@Override
	public void underAttack(Character character) {
		System.out.println("Factory underAttack");
		this.health -= character;
		
	}

	public void move() {
		if(status == 1) {
			System.out.println("Factory move");
		}
	}

	public void land() {
		if(status == 1) {
			System.out.println("Factory land");
			status = 0;
		}
		
	}

	public void fly() {
		if(status == 0) {
			System.out.println("Factory fly");
			status = 1;
		}
	}

}
