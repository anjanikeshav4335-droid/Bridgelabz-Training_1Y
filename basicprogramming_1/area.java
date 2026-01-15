import java.util.Scanner;
class area
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius");
		int r = input.nextInt();
		double p = 3.14;
		double area = p*r*r;
		System.out.println("Area of circle - " +area);
	}
}		