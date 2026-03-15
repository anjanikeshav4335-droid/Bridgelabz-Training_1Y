
public class PalindromeCheck {
    String text;
    public boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + "is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        PalindromeCheck checker = new PalindromeCheck();
        checker.text="Krishna";
        checker.displayResult();
    }
}