import java.time.LocalDate;

public class Transaction {

    private LocalDate date;
    private String type;
    private double amount;
    private double balance;

    public Transaction(
        LocalDate date,
        String type,
        double amount,
        double balance
    ) throws IllegalArgumentException {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws IllegalArgumentException {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return (
            "Transaction[" +
            "date=" +
            date +
            ", type=" +
            type +
            ", amount=" +
            amount +
            ", balance=" +
            balance +
            ']'
        );
    }
}
