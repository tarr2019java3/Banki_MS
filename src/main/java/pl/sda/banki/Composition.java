package pl.sda.banki;

public class Composition {
    User user;
    BankAccount bankAccount;

    public Composition(User user, BankAccount bankAccount) {
        this.user = user;
        this.bankAccount = bankAccount;
    }

    public User getUser() {
        return user;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
