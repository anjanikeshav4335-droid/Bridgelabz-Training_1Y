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
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest factor (besides itself) = " + greatestFactor);
        }
    }
}