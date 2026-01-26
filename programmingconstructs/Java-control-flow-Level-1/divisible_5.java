import java.util.Scanner;
class divisible
{
	public static void main(String ...args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = input.nextInt();
		if (number%5 == 0)
		{
			System.out.println("Divisible by 5");
		}
		else 
		{
				System.out.println("not divisible");
		}
	}
}
