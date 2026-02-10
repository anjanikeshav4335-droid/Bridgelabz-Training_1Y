import java.util.Scanner;
import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int[] table = new int[10];

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
}