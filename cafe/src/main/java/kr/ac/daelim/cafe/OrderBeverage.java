package kr.ac.daelim.cafe;

public class OrderBeverage {

	public static void main(String[] args) {
		
		Beverage houseblend = new HouseBlend();
		System.out.println(houseblend.getDescription());
		System.out.println(houseblend.cost());
		houseblend = new Mocha(houseblend);
		
		
		Beverage h1 = new HouseBlend();
		h1 = new Milk(h1);
		System.out.println("재료 : "+ h1.getDescription());
		System.out.println("가격 : "+ h1.cost());
		
		Beverage h2 = new HouseBlend();
		h2 = new Milk(h2);
		h2 = new Soy(h2);
		
		System.out.println("재료 : "+ h2.getDescription());
		System.out.println("가격 : "+ h2.cost());
	}

}
