import java.util.Scanner;
class miles
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of pens");
		double k = input.nextDouble();
		System.out.println("Enter number of students");
		double m = input.nextDouble();
		double q = k/m;
		System.out.println("Quotient is:"+q);
		double r = k-(m*q);
		System.out.println("Remainder is"+r);
	}
}
