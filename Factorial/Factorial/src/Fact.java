import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//
		int i,p=1,n;
		System.out.print("Enter the Number: ");
		n=scanner.nextInt();
		scanner.nextLine();
		for(i=1;i<=n;i++)
		{
			p=i*p;
		}
		System.out.println("Factorial = "+p);

	}

}
