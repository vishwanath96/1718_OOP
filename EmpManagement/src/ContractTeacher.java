
public class ContractTeacher extends TeachingStaff implements DailyWage,Schedule {

	@Override
	public void wages() {
		System.out.print("\nIt is wages()\n");
		
	}

	@Override
	public void calculateSalary() {
		System.out.print("\nIt is CalculateSalary()\n");
		wages();
		calculatePay();
	}
	
	@Override
	public void calculatePay() {
		System.out.print("\nIt is CalculatePay()\n");
	}
	
	
	
}
