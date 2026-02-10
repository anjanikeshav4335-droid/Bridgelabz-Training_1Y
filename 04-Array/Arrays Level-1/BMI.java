import java.util.Scanner;
import java.util.Arrays;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) of person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.println("Enter height (m) of person " + (i+1) + ": ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("Weights: " + Arrays.toString(weight));
        System.out.println("Heights: " + Arrays.toString(height));
        System.out.println("BMI: " + Arrays.toString(bmi));
        System.out.println("Status: " + Arrays.toString(status));

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) + " -> Height: " + height[i] + " m, Weight: " + weight[i] + " kg, BMI: " + bmi[i] + ", Status: " + status[i]);
        }
    }
}