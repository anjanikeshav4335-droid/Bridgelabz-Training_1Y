import java.util.Scanner;
class SumofNumber 
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) 
		{
            System.out.println("Enter number (0 or negative to stop)");
            double value = input.nextDouble();
            if (value <= 0) 
			{
                break;
            }
            total = total + value;
        }
        System.out.println("Total sum = " + total);
    }
}