public class SavingsAccount extends Account {

    private double minimumBalance;

    public SavingsAccount(
        int id,
        double balance,
        double minimumBalance,
        double annualIntrestRate
    ) {
        super(id, balance, annualIntrestRate);
        this.minimumBalance = minimumBalance;
    }

    public void withdraw(double amount) {
        if (amount > super.getBalance() + minimumBalance) {
            System.out.println("Insufficient funds");
        } else {
            super.setBalance(super.getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return (
            "SavingsAccount[" +
            "id=" +
            getId() +
            ", balance=" +
            getBalance() +
            ", minimumBalance=" +
            minimumBalance +
            ", annualIntrestRate=" +
            getAnnualIntrestRate() +
            ", dateCreated=" +
            super.getDateCreated().toString() +
            ']'
        );
    }
}
