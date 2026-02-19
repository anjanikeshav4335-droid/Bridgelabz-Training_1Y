import java.util.*;

class SubstringSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub = "";

        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }

        System.out.println("CharAt substring: " + sub);
        System.out.println("Built-in substring: " + text.substring(start, end));
    }
}
