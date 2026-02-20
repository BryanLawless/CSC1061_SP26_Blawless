public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(
        int id,
        double balance,
        double overdraftLimit,
        double annualIntrestRate
    ) {
        super(id, balance, annualIntrestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(
        int id,
        String name,
        double balance,
        double overdraftLimit,
        double annualIntrestRate
    ) {
        super(id, name, balance, annualIntrestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount > super.getBalance() + overdraftLimit) {
            System.out.println("Insufficient funds");
        } else {
            super.setBalance(super.getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return (
            "CheckingAccount[" +
            "id=" +
            getId() +
            ", balance=" +
            getBalance() +
            ", overdraftLimit=" +
            overdraftLimit +
            ", annualIntrestRate=" +
            getAnnualIntrestRate() +
            ", dateCreated=" +
            super.getDateCreated().toString() +
            ']'
        );
    }
}
