import java.util.Scanner;
class average
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = input.nextInt();
		System.out.println("Enter the Second Number");
		int b = input.nextInt();
		System.out.println("Enter the Third Number");
		int c = input.nextInt();
		double average = (a+b+c)/3;
		System.out.println("Average of three Numbers - " +average);
	}
}	