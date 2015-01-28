import java.util.Scanner;
public class Prog_Challenge_1 
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		
		String name = in.nextLine();
		int age = in.nextInt();
		double annualPay = in.nextDouble();
		
		System.out.printf("My name is " + name
						+ ", my age is " + age
						+ " and i hope to earn $" + annualPay + " per year.");
		
		
	}

}
