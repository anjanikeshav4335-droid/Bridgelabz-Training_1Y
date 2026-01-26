import java.util.Scanner;
class Multiple
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer less than 100");
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
        } else {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0)
                    System.out.println(i);
            }
        }
    }
}