package pl.sda.banki;

public class BankAccount {
    private int id;
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(int id, String name, int accountNumber, double balance) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
