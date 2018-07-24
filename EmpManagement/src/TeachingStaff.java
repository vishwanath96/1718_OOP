
public class TeachingStaff extends Staff {

	private Integer noOfTeachingHours;
	
	public void teach() {
		System.out.println("teaching now");
	}
	
	public TeachingStaff() {
		super();
		noOfTeachingHours = 0;
	}
	
	public TeachingStaff(Integer noOfTeachingHours) {
		super();
		this.noOfTeachingHours = noOfTeachingHours;
	}

	@Override
	public void calculateSalary() {
		System.out.println("teaching salary");
		
	}

}
