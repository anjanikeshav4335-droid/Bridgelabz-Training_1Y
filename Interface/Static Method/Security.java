interface Security {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8;
    }
}

public class PasswordDemo {
    public static void main(String[] args) {
        String pass = "abc12345";
        if (SecurityUtils.isStrongPassword(pass)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}