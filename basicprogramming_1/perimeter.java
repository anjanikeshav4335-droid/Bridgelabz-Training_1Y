import java.util.Scanner;
class perimeter
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Length:");
		int l = input.nextInt();
		System.out.println("Enter the Breadth:");
		int b = input.nextInt();
		double	 perimeter = 2*(l+b);
		System.out.println("Perimeter of Rectangle - " +perimeter);
	}
}	