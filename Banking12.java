// 12. Design a Java program to demonstrate thread synchronization using a synchronized block. Consider a BankAccount class with a balance, and deposit() and withdraw() methods that are synchronized for thread safety. Implement two threads: one for depositing money into the account and another for withdrawing money concurrently.

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ", Current Balance: " + balance);
            } else {
                System.out.println("Insufficient balance to withdraw: " + amount);
            }
        }
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class Banking12 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        DepositThread depositThread = new DepositThread(account, 500);
        WithdrawThread withdrawThread = new WithdrawThread(account, 700);

        depositThread.start();
        withdrawThread.start();
    }
}
