import java.util.Scanner;
class SumofNumbers
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;
        System.out.println("Enter numbers (0 to stop)");
        value = input.nextDouble();
        while (value != 0) 
		{
            total = total + value;
            value = input.nextDouble();
        }
        System.out.println("Total sum = " + total);
    }
}