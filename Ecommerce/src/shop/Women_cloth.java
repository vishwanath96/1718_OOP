package shop;

public class Women_cloth extends Clothing {
	private String Tops;
	private String Jeans;
	private String Accessories;
	private Integer Price;
	
	public String getTops() {
		return Tops;
	}
	public void setTops(String tops) {
		Tops = tops;
	}
	public String getJeans() {
		return Jeans;
	}
	public void setJeans(String jeans) {
		Jeans = jeans;
	}
	public String getAccessories() {
		return Accessories;
	}
	public void setAccessories(String accessories) {
		Accessories = accessories;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}

	public Women_cloth(String tops, String jeans, String accessories) {
		super();
		Tops = tops;
		Jeans = jeans;
		Accessories = accessories;
	}
	
}
