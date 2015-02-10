
//OK. O.Aktunc
//Jorge A. Padilla BMI computing java program
import javax.swing.JOptionPane;

public class Prog2_ComputeBMI 
{
	public static void main (String[] args)
	{
		String input1 = JOptionPane.showInputDialog("Enter your weight in pounds.");
		double weight = Integer.parseInt(input1) * 0.45359237;
		
		String input2 = JOptionPane.showInputDialog("Enter your height in inches.");
		double height = Integer.parseInt(input2) * 0.0254;
		
		double bmi = weight/(height * height);
		
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + bmi);
	}
}
