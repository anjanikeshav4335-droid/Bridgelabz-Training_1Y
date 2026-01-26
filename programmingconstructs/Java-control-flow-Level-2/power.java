import java.util.Scanner;
class Power
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
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(number + " ^ " + power + " = " + result);
        }
    }
}