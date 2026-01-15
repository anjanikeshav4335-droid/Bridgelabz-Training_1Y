import java.util.Scanner;
class kilometer
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Kilometer distance");
		int a = input.nextInt();
		double miles = a*0.621371;
		System.out.println("Distance in Miles - " +miles);
	}
}	