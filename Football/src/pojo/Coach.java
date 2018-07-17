package pojo;

public class Coach {
	private String cname;
	private Integer age;
	private String team_name;
	
	public Coach() {
		age = 0;
		cname = "";
		team_name = "";
		System.out.println("creating object");
	}
	
	public Coach(String cname, Integer age, String team_name) {
		this.cname = cname;
		this.age = age;
		this.team_name = team_name;
	}
	
	public void instructs() {
		System.out.println("instructs");
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
}