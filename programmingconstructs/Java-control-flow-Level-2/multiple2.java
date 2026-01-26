import java.util.Scanner;
class Multiples
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer less than 100");
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
        } else {
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0)
                    System.out.println(counter);
                counter--;
            }
        }
    }
}