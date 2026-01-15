import java.util.Scanner;
class volume
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = input.nextInt();
		System.out.println("Enter the Height");
		int h = input.nextInt();
		double p = 3.14;
		double volume = p*r*r*h;
		System.out.println("Volume of Cylinder - " +volume);
	}
}	