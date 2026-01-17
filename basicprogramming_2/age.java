import java.util.Scanner;
class age
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter birth year");
		int a = input.nextInt();
		System.out.println("Enter current year");
		int b = input.nextInt();
		int age = b-a;
		System.out.println("Age of child is:"+age);
	}
}
