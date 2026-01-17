import java.util.Scanner;
class price
{
	public static void main(String args[])
	{	
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the quantity:");
		double f = input.nextDouble();
		System.out.println("Enter the unit price");
		int a = input.nextInt();
		double p = f*a;
		System.out.println("Total price is:"+p);
	}
}

