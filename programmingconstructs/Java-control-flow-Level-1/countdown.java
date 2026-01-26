import java.util.Scanner;
class Countdown {
    public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter countdown start number");
        int counter = input.nextInt();
        while (counter >= 1)
		{
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launch!");
    }
}