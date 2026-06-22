public class BankAccount {
    private static int totalAccounts = 0;
    private String accountNumber;
    private String holder;
    private double balance;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public String getStatement() {
        return "Account: " + accountNumber + ", Holder: " + holder + ", Balance: " + balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC001", "Alice", 1000.0);
        BankAccount acc2 = new BankAccount("ACC002", "Bob", 1500.0);
        BankAccount acc3 = new BankAccount("ACC003", "Charlie", 500.0);

        acc1.deposit(200.0);
        acc1.withdraw(150.0);
        acc1.deposit(300.0);
        acc1.withdraw(50.0);
        acc1.withdraw(1500.0);

        acc2.deposit(100.0);
        acc2.withdraw(500.0);
        acc2.withdraw(100.0);
        acc2.deposit(250.0);
        acc2.withdraw(50.0);

        acc3.deposit(50.0);
        acc3.deposit(150.0);
        acc3.withdraw(200.0);
        acc3.withdraw(100.0);
        acc3.deposit(300.0);

        System.out.println(acc1.getStatement());
        System.out.println(acc2.getStatement());
        System.out.println(acc3.getStatement());
        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
