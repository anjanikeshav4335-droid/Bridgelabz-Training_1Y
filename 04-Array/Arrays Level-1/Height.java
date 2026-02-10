import java.util.Scanner;
import java.util.Arrays;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.println("Mean height of the football team = " + mean);

        sc.close();
    }
}