//OK. O.Aktunc

//Jorge A. Padilla MPG calculation java program
import java.util.Scanner;

public class Prog1_MilesPerGallon 
{
	public static void main (String[] args)
	{
		int miles;
		int gallons;
		double mpg;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the miles driven:");
		miles = input.nextInt();
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = input.nextInt();
		
		mpg = miles/gallons;
		System.out.print("The miles-per-gallon is " + mpg);
	}
}
