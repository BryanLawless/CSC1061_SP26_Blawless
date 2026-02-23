package schoolrecords;

/**
 * Represents a person with basic contact information.
 * This is the base class for Student and Employee.
 *
 * @author Bryan Lawless
 * @version 1.0.0
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    /**
     * Default constructor for Person.
     */
    public Person() {
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
        this.emailAddress = "";
    }

    /**
     * Constructor with all parameters.
     *
     * @param name the person's name
     * @param address the person's address
     * @param phoneNumber the person's phone number
     * @param emailAddress the person's email address
     */
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the person's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the person's address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the person's address.
     *
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the person's phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the person's phone number.
     *
     * @param phoneNumber the phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the person's email address.
     *
     * @return the email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the person's email address.
     *
     * @param emailAddress the email address to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Returns a string representation of the Person object.
     *
     * @return string containing person information
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Email: " + emailAddress;
    }
}
