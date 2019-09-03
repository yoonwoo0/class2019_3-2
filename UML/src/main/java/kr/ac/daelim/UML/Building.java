package kr.ac.daelim.UML;

public abstract class Building {
	protected String name;
	protected int health;
	protected int armor;
	
	abstract public void Construct();
	abstract public void underAttack(Character character);
	
	
}
