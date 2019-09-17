package kr.ac.daelim.zoo;

public class Zoo {
	
	static Animal tiger;
	static Animal eagle;
	static Animal turtle;

	public static void main(String[] args) {
		
		eagle = new Eagle();
		tiger = new Tiger();
		turtle = new Turtle();
	        
        eagle.display();
        eagle.performCry();
        eagle.performFly();
        eagle.performSwim();
        System.out.println();
       

        tiger.display();
        tiger.performCry();
        tiger.performFly();
        tiger.performSwim();
        System.out.println();
        
        turtle.display();
        turtle.performCry();
        turtle.performFly();
        turtle.performSwim();

	}

}
