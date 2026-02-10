import java.util.Scanner;
import java.util.Arrays;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        double[] percentages = new double[n];
        String[] grades = new String[n];

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Physics marks for student " + (i+1) + ": ");
            physics[i] = sc.nextDouble();
            while (physics[i] < 0) {
                System.out.println("Marks must be positive. Enter again: ");
                physics[i] = sc.nextDouble();
            }

            System.out.println("Enter Chemistry marks for student " + (i+1) + ": ");
            chemistry[i] = sc.nextDouble();
            while (chemistry[i] < 0) {
                System.out.println("Marks must be positive. Enter again: ");
                chemistry[i] = sc.nextDouble();
            }

            System.out.println("Enter Maths marks for student " + (i+1) + ": ");
            maths[i] = sc.nextDouble();
            while (maths[i] < 0) {
                System.out.println("Marks must be positive. Enter again: ");
                maths[i] = sc.nextDouble();
            }

            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " -> Physics: " + physics[i] +
                               ", Chemistry: " + chemistry[i] +
                               ", Maths: " + maths[i] +
                               ", Percentage: " + percentages[i] +
                               "%, Grade: " + grades[i]);
        }
    }
}