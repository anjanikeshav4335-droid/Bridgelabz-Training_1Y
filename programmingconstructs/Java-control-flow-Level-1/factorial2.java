import java.util.Scanner;
class Factorial 
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = input.nextInt();
        if (n < 0) 
		{
            System.out.println("Invalid input");
        } else 
		{
            int fact = 1;
            for (int i = 1; i <= n; i++) 
			{
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        }
    }
}