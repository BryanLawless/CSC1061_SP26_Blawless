package schoolrecords;

/**
 * Represents a faculty member, which is a type of Employee.
 * Extends the Employee class and adds faculty-specific information.
 *
 * @author Bryan Lawless
 * @version 1.0.0
 */
public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    /**
     * Default constructor for Faculty.
     */
    public Faculty() {
        super();
        this.officeHours = "";
        this.rank = "";
    }

    /**
     * Constructor with all parameters.
     *
     * @param name the faculty member's name
     * @param address the faculty member's address
     * @param phoneNumber the faculty member's phone number
     * @param emailAddress the faculty member's email address
     * @param office the faculty member's office location
     * @param salary the faculty member's salary
     * @param dateHired the date the faculty member was hired
     * @param officeHours the faculty member's office hours
     * @param rank the faculty member's rank (junior or senior)
     */
    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, double salary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    /**
     * Gets the faculty member's office hours.
     *
     * @return the office hours
     */
    public String getOfficeHours() {
        return officeHours;
    }

    /**
     * Sets the faculty member's office hours.
     *
     * @param officeHours the office hours to set
     */
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * Gets the faculty member's rank.
     *
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the faculty member's rank.
     *
     * @param rank the rank to set (junior or senior)
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * Returns a string representation of the Faculty object.
     *
     * @return string containing faculty information
     */
    @Override
    public String toString() {
        return "Faculty:\n" +
               super.toString() + "\n" +
               "Office Hours: " + officeHours + "\n" +
               "Rank: " + rank;
    }
}
