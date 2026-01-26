import java.util.Scanner;
class naturalnumber
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int n = input.nextInt();
		if (n == 0)
		{
			System.out.println("Number is not natural number");
		}
		else
		{
			int sum = (n*(n+1))/2;
			System.out.println("Sum of number is:"+sum);
		}
	}
}
