//circle math
//jorge a. padilla
public class Assignment_1 
{
	public static void main(String[] args)
	{
		int rad = 10;
		int diam;  		//2 * r
		double circ; 	// 2 * pi * r
		double area;  	//pi * r squared
		double pi = Math.PI;
		
		diam = rad * 2;
		area = rad * rad * pi;
		circ = 2 * pi * rad;
		
		System.out.println("the diameter of this circle is: " + diam);
		System.out.println("the area of this circle is : " + area);
		System.out.println("the circumference of this circle is: " + circ);
	}

}

//another example of saying one of the above statements is: 
//system.out.printf("the diameter of this circle is %d", diam);
//concatenation works as such if either the left or right of the + sign is followed/preceeded by a string