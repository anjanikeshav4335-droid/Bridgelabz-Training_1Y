import java.util.Scanner;
class Countdown 
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter countdown start number");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--)
		{
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
    }
}