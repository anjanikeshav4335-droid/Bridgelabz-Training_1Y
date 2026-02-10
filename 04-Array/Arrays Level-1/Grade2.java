import java.util.Scanner;
import java.util.Arrays;

public class Grade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; 
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Physics marks for student " + (i+1) + ": ");
            marks[i][0] = sc.nextDouble();
            while (marks[i][0] < 0) {
                System.out.println("Marks must be positive. Enter again: ");
                marks[i][0] = sc.nextDouble();
            }

            System.out.println("Enter Chemistry marks for student " + (i+1) + ": ");
            marks[i][1] = sc.nextDouble();
            while (marks[i][1] < 0) {
                System.out.println("Marks must be positive. Enter again: ");
                marks[i][1] = sc.nextDouble();
            }

            System.out.println("Enter Maths marks for student " + (i+1) + ": ");
            marks[i][2] = sc.nextDouble();
            while (marks[i][2] < 0) {
                System.out.println("Marks must be positive. Enter again: ");
                marks[i][2] = sc.nextDouble();
            }

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " -> Physics: " + marks[i][0] +
                               ", Chemistry: " + marks[i][1] +
                               ", Maths: " + marks[i][2] +
                               ", Percentage: " + percentages[i] +
                               "%, Grade: " + grades[i]);
        }
    }
}