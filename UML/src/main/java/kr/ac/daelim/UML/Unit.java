package kr.ac.daelim.UML;

public abstract class Unit {
	
	public String name;
	public int health;
	public void move() {
	}
	abstract public void underAttack(Character character);

}
