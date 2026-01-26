import java.util.Scanner;
class Armstrong 
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
            sum = sum + (digit * digit * digit);
            original = original / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } 
		else 
		{
            System.out.println("Not Armstrong Number");
        }
    }
}