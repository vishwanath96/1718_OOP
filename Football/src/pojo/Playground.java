package pojo;

public class Playground {
	private String venue;
	private Float length;
	private Float breath;
	
	public Playground() {
		venue = "";
		length = (float) 0;
		breath = (float) 0;
		System.out.println("creating object");
	}
	
	public Playground(String venue, Float length, Float breath) {
		this.venue = venue;
		this.length = length;
		this.breath = breath;
	}
	
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getBreath() {
		return breath;
	}
	public void setBreath(Float breath) {
		this.breath = breath;
	}
}