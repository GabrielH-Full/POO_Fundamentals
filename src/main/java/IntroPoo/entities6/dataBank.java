package IntroPoo.entities6;

public class dataBank {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public dataBank(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public dataBank(String accountHolder, int accountNumber, double depositMoney) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        deposit(depositMoney);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}