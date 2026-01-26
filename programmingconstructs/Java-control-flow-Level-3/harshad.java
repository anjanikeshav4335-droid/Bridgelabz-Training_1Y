import java.util.Scanner;
class Harshad 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = input.nextInt();

        int original = number;
        int sum = 0;

        while (original != 0) 
		{
            int digit = original % 10;
            sum = sum + digit;
            original = original / 10;
        }

        if (number % sum == 0) 
		{
            System.out.println("Harshad Number");
        } 
		else 
		{
            System.out.println("Not Harshad Number");
        }
    }
}