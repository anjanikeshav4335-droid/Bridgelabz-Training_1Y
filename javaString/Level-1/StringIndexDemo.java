import java.util.*;

class StringIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            System.out.println(text.charAt(text.length()));
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
