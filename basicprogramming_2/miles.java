import java.util.Scanner;
class miles
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter K.M distance");
		double k = input.nextDouble();
		double m = k*1.6;
		System.out.println("Distance in miles:"+m);
	}
}
