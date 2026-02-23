package schoolrecords;

/**
 * Represents a student, which is a type of Person.
 * Extends the Person class and adds student-specific information.
 *
 * @author Bryan Lawless
 * @version 1.0.0
 */
public class Student extends Person {
    private String status;

    /**
     * Default constructor for Student.
     */
    public Student() {
        super();
        this.status = "";
    }

    /**
     * Constructor with all parameters.
     *
     * @param name the student's name
     * @param address the student's address
     * @param phoneNumber the student's phone number
     * @param emailAddress the student's email address
     * @param status the student's status (freshman, sophomore, junior, or senior)
     */
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    /**
     * Gets the student's status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the student's status.
     *
     * @param status the status to set (freshman, sophomore, junior, or senior)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return string containing student information
     */
    @Override
    public String toString() {
        return "Student:\n" +
               super.toString() + "\n" +
               "Status: " + status;
    }
}
