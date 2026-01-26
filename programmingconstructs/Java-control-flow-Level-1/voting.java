import java.util.Scanner;
class voting
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age");
		int age = input.nextInt();
		if (age >= 18)
		{
			System.out.println("You can vote");
		}
		else
		{
		System.out.println("You are not allowed to vote");
		}
	}
}
	