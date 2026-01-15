import java.util.Scanner;
class simple
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principle value");
		int p = input.nextInt();
		System.out.println("Enter Time");
		int t = input.nextInt();
		System.out.println("Enter rate of intrest");
		int r = input.nextInt();
		double si = (p*r*t)/100;
		System.out.println("Simple intrest is - " +si);
	}
}	