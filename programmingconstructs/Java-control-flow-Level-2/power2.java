import java.util.Scanner;
class PowerWhile 
{
    public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.println("Enter the power");
        int power = input.nextInt();
        if (number < 0 || power < 0) {
            System.out.println("Invalid input");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result = result * number;
                counter++;
            }
            System.out.println(number + " ^ " + power + " = " + result);
        }
    }
}