package pojo;

public class Ball {
	private Integer size;
	private String colour;
	private Float weight;
	
	public Ball() {
		size = 0;
		colour = "";
		weight = (float) 0;
		System.out.println("creating object");
	}
	
	public Ball(Integer size, String colour, Float weight) {
		this.size = size;
		this.colour = colour;
		this.weight = weight;
	}
	
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
}
