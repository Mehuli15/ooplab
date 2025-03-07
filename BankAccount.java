public class BankAccount {
    public String accountHolder;
    public double balance;
    public int accountNumber;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    -

    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Mehuli Sarkar", 50000, 1200);
        ba.withdrawal(600);
        ba.deposit(2000);
    }
}