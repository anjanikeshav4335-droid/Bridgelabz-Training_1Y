
import java.util.Scanner;
public class PointGeometry {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return d;
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1; 
        double[] result = new double[2];
        result[0] = m;
        result[1] = b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        double dist = findDistance(x1, y1, x2, y2);
        double[] arr = findLineEquation(x1, y1, x2, y2);
        System.out.println("Distance: " + dist);
        System.out.println("Slope (m): " + arr[0]);
        System.out.println("Y-intercept (b): " + arr[1]);
        System.out.println("y"+"="+arr[0] +"* x +"+ arr[1]);
    }
}