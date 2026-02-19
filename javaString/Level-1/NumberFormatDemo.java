import java.util.*;

class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Invalid number");
        }
    }
}
