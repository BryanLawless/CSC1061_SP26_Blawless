public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(
        String firstName,
        String lastName,
        String socialSecurityNumber,
        double weeklySalary
    ) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return (
            super.toString() +
            "\n" +
            "Weekly Salary: $" +
            String.format("%.2f", weeklySalary) +
            "\n" +
            "Payment Amount: $" +
            String.format("%.2f", getPaymentAmount())
        );
    }
}
