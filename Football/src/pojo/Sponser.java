package pojo;

public class Sponser extends Team implements AccDetail {

	@Override
	public void displayDetails() {
		System.out.println("Account Balance : $2500000");
		
	}

	@Override
	public void management() {
		displayDetails();
	}

}
