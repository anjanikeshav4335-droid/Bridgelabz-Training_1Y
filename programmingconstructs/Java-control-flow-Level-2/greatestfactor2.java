import java.util.Scanner;
class GreatestFactor
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input");
        } else {
            int greatestFactor = 1;
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("Greatest factor (besides itself) = " + greatestFactor);
        }
    }
}