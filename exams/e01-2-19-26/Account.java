import java.time.LocalDate;
import java.util.ArrayList;

public class Account {

    private int id;
    private String name;
    private double balance;
    private double annualIntrestRate;
    private LocalDate dateCreated;
    private ArrayList<Transaction> transactions;

    public Account() {
        this.id = 0;
        this.name = "No Name Recorded";
        this.balance = 0;
        this.annualIntrestRate = 0;
        this.dateCreated = LocalDate.now();
        this.transactions = new ArrayList<>();
    }

    public Account(int id, double balance, double annualIntrestRate) {
        this.id = id;
        this.balance = balance;
        this.annualIntrestRate = annualIntrestRate;
        this.dateCreated = LocalDate.now();
        this.transactions = new ArrayList<>();
    }

    public Account(
        int id,
        String name,
        double balance,
        double annualIntrestRate
    ) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.dateCreated = LocalDate.now();
        this.transactions = new ArrayList<>();
        this.annualIntrestRate = annualIntrestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualIntrestRate() {
        return annualIntrestRate;
    }

    public void setAnnualIntrestRate(double annualIntrestRate) {
        this.annualIntrestRate = annualIntrestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyIntrestRate() {
        return annualIntrestRate / 12;
    }

    public double getMonthlyIntrest() {
        return (balance * getMonthlyIntrestRate()) / 100;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= amount;

        this.transactions.add(
            new Transaction(LocalDate.now(), "W", amount, balance)
        );
    }

    public void deposit(double amount) {
        balance += amount;

        this.transactions.add(
            new Transaction(LocalDate.now(), "D", amount, balance)
        );
    }

    @Override
    public String toString() {
        return (
            "Account[" +
            "id=" +
            getId() +
            ", name=" +
            getName() +
            ", balance=" +
            getBalance() +
            ", annualIntrestRate=" +
            getAnnualIntrestRate() +
            ", dateCreated=" +
            getDateCreated() +
            ", transactions=" +
            getTransactions() +
            "]"
        );
    }
}
