abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int num, String name, double bal) { super(num, name, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Savings loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int num, String name, double bal) { super(num, name, bal); }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Current loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
            new SavingsAccount(111, "Anjani", 6000),
            new CurrentAccount(222, "Keshav", 15000)
        );
        for (BankAccount acc : accounts) {
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                System.out.println("Eligible: " + ((Loanable)acc).calculateLoanEligibility());
            }
        }
    }
}