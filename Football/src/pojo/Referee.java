package pojo;

public class Referee {
	private String rname;
	private Integer age;
	
	public void gives_fouls() {
		System.out.println("gives_fouls");
	}
	
	public Referee() {
		age = 0;
		rname = "";
		System.out.println("creating object");
	}
	
	public Referee(String rname, Integer age) {
		this.rname = rname;
		this.age = age;
	}
	
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}