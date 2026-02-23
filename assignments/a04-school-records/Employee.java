package schoolrecords;

/**
 * Represents an employee, which is a type of Person.
 * Extends the Person class and adds employee-specific information.
 *
 * @author Bryan Lawless
 * @version 1.0.0
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private String dateHired;

    /**
     * Default constructor for Employee.
     */
    public Employee() {
        super();
        this.office = "";
        this.salary = 0.0;
        this.dateHired = "";
    }

    /**
     * Constructor with all parameters.
     *
     * @param name the employee's name
     * @param address the employee's address
     * @param phoneNumber the employee's phone number
     * @param emailAddress the employee's email address
     * @param office the employee's office location
     * @param salary the employee's salary
     * @param dateHired the date the employee was hired
     */
    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    /**
     * Gets the employee's office location.
     *
     * @return the office
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the employee's office location.
     *
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * Gets the employee's salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     *
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Gets the date the employee was hired.
     *
     * @return the date hired
     */
    public String getDateHired() {
        return dateHired;
    }

    /**
     * Sets the date the employee was hired.
     *
     * @param dateHired the date hired to set
     */
    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    /**
     * Returns a string representation of the Employee object.
     *
     * @return string containing employee information
     */
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Office: " + office + "\n" +
               "Salary: $" + String.format("%.2f", salary) + "\n" +
               "Date Hired: " + dateHired;
    }
}
