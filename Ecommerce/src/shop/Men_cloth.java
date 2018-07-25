package shop;

public class Men_cloth extends Clothing{

	private String Tops;
	private String Jeans;
	private String Accessories;
	
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
	public Men_cloth(){
		 super();
			this.Tops="";
			this.Jeans="";
			this.Accessories="";
		 
	 }
	public Men_cloth(String tops, String jeans, Integer price) {
		super(price);
		Tops = tops;
		Jeans = jeans;
		
	}
	
}
