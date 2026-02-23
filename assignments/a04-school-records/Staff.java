package schoolrecords;

/**
 * Represents a staff member, which is a type of Employee.
 * Extends the Employee class and adds staff-specific information.
 *
 * @author Bryan Lawless
 * @version 1.0.0
 */
public class Staff extends Employee {
    private String title;

    /**
     * Default constructor for Staff.
     */
    public Staff() {
        super();
        this.title = "";
    }

    /**
     * Constructor with all parameters.
     *
     * @param name the staff member's name
     * @param address the staff member's address
     * @param phoneNumber the staff member's phone number
     * @param emailAddress the staff member's email address
     * @param office the staff member's office location
     * @param salary the staff member's salary
     * @param dateHired the date the staff member was hired
     * @param title the staff member's title
     */
    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    /**
     * Gets the staff member's title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the staff member's title.
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns a string representation of the Staff object.
     *
     * @return string containing staff information
     */
    @Override
    public String toString() {
        return "Staff:\n" +
               super.toString() + "\n" +
               "Title: " + title;
    }
}
