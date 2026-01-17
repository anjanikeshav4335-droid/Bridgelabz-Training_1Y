import java.util.Scanner;
class triangle
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base of triangle:");
		int b = input.nextInt();
		System.out.println("Enter the height of triangle:");
		int h = input.nextInt();
		double a = (b*h)/2;
		System.out.println("Area of triangle in cm:"+a);
		double i = a/2.54;
		System.out.println("Area of triangle in inches:"+i);
		double f = i/12;
		System.out.println("Area of traingle in feet:"+f);
	}
}

		