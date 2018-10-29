package pojo;

import java.io.Serializable;

public class Student implements Serializable{

	private Integer rollno;
	private String name;

	public Student() {
		super();
		this.rollno = 0;
		this.name = "";
	}
	
	public Student(Integer rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
