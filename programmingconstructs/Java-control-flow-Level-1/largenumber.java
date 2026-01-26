import java.util.Scanner;
class largenumber
{
	public static void main(String ...args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number1:");
		int a = input.nextInt();
		System.out.println("Enter Number2:");
		int b = input.nextInt();
		System.out.println("Enter Number3:");
		int c = input.nextInt();
		if (a >= b && a >= c)
		{
			System.out.println("largest number:"+a);
		}
		else if (b >= a && b >= c)
		{
			System.out.println("largest number:"+b);
		}
		else
		{
			System.out.println("largest number:"+c);
		}
	}
}

		
			
		