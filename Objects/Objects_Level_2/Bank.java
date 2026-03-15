
class Bank_details {
    String accountHolder;
    String accountNumber;
    double balance;
    public void deposit(double amount) {
            balance += amount;
            System.out.println("Successfully deposited" + amount);
        } 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } 
		else{
            System.out.println("Insufficient balance!");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Bank_details acc = new Bank_details();
        acc.accountHolder = "Krishna Singhal";
        acc.accountNumber = "123456789";
        acc.balance = 1000.0;
        acc.displayBalance();
        acc.deposit(500);
        acc.withdraw(200);
		acc.withdraw(2000);
        acc.displayBalance();
    }
}