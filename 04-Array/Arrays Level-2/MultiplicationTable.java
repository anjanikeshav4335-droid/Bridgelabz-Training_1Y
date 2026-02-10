import java.util.Scanner;
import java.util.Arrays;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int[] multiplicationResult = new int[10];

        System.out.print("Enter a number (between 6 and 9): ");
        number = sc.nextInt();

        if (number >= 6 && number <= 9) {
            for (int i = 0; i < multiplicationResult.length; i++) {
                multiplicationResult[i] = number * (i + 1);
            }

            for (int i = 0; i < multiplicationResult.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        } else {
            System.out.println("Please enter a number between 6 and 9.");
        }

        sc.close();
    }
}