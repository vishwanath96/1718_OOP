import java.util.Scanner;
public class FactApp {

	public static void main(String[] args) {
		Fact cal=new Fact();
		Scanner scanner = new Scanner(System.in);
		int p=1;
		System.out.print("Enter the Number: ");
		Integer n=scanner.nextInt();
		scanner.nextLine();
		cal.setP(p);
		cal.factorial(n);
	}

}
