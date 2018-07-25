package shop;

public class Clothing extends Department{

 private Integer price; 
	
	
	public Integer getPrice() {
	return price;
}


public void setPrice(Integer price) {
	this.price = price;
}

	public Clothing(){
		this.price=0;
	}

	public Clothing(Integer price) {
		this.price = price;
	}

	@Override
	public void DepCat() {
		System.out.println("This Is Clothing Department");
		
	}

}
