import java.util.Scanner;
import java.util.Arrays;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
     
        int[] actualDigits = Arrays.copyOf(digits, index);

        int largest = 0, secondLargest = 0;
        for (int d : actualDigits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Digits: " + Arrays.toString(actualDigits));
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}