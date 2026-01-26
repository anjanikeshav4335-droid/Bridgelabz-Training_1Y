import java.util.Scanner;
class Digit
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = input.nextInt();

        int count = 0;

        if (number == 0) 
		{
            count = 1;
        } 
		else 
		{
            while (number != 0) 
			{
                number = number / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}