import java.util.Scanner;
class sam
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Math number");
		int a = input.nextInt();
		System.out.println("Enter Physics number");
		int b = input.nextInt();
		System.out.println("Enter Chemistry number");
		int c = input.nextInt();
		int average = (a+b+c)/3;
		System.out.println("Average marks"+average);
	}
}