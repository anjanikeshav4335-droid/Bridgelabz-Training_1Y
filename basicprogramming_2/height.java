import java.util.Scanner;
class height
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height in cm:");
		int f = input.nextInt();
		double d = f/2.54;
		System.out.println("Height in inches:"+d);
		double a = d/12;
		System.out.println("Height in Feet:"+a);
	}
}
