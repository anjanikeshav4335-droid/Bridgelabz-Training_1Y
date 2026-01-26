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
            int i = 1;
            while (i <= n) 
			{
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        }
    }
}