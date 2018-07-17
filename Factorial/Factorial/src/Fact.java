import java.util.Scanner;

public class Fact {		
		private int p;
		
		
		public void factorial(int n)
		{
			int i;
			for(i=1;i<=n;i++)
			{
				p=i*p;
			}
			System.out.println("Factorial = "+p);
		}
		public int getP() {
			return p;
		}
		public void setP(int p) {
			this.p = p;
		}
}

