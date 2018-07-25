package shop;

public class App {

	public static void main (String[] args) {
		
		Women_cloth w1 = new Women_cloth("Killer", "Pepe", "chain");
		Men_cloth m1 = new Men_cloth();
		
		
		w1.DepCat();
		System.out.println("The Women Categories :" +"\nTop: " +w1.getTops() +"\nJeans: " +w1.getJeans() +"\nAccesories: " +w1.getAccessories());
		
		
		m1.DepCat();
		m1.setTops("Nike");
		m1.setJeans("adidas");
		
		System.out.println("The Men Categories :" +"\nTop: " +m1.getTops() +"\nJeans: " +m1.getJeans() );
		
		
		
	}
	
}
