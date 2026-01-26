import java.util.Scanner;

class season {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month:");
        String month = input.next().toLowerCase();

        System.out.println("Enter date:");
        int d = input.nextInt();

        if (month.equals("march") && d >= 20 && d <= 31) {
            System.out.println("Spring Season");
        }
        else if (month.equals("april") && d >= 1 && d <= 30) {
            System.out.println("Spring Season");
        }
        else if (month.equals("may") && d >= 1 && d <= 31) {
            System.out.println("Spring Season");
        }
        else if (month.equals("june") && d >= 1 && d <= 20) {
            System.out.println("Spring Season");
        }
        else {
            System.out.println("Not Spring Season");
        }
    }
}
