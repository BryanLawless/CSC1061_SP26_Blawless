package schoolrecords;

import java.io.*;
import java.util.ArrayList;

/**
 * Database class for managing person records.
 * Provides methods to write and read Person objects to/from a file.
 *
 * @author Bryan Lawless
 * @version 1.0.0
 */
public class Database {

    private static final String PERSON_DATABASE = "PersonDatabase";

    /**
     * Constructor that creates the PersonDatabase file if it doesn't exist.
     */
    public Database() {
        try {
            File file = new File(PERSON_DATABASE);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(
                "Error creating database file: " + e.getMessage()
            );
        }
    }

    /**
     * Writes a Person object to the PersonDatabase file.
     * Includes the class name and all information for the object.
     *
     * @param person the Person object to write
     */
    public void writePerson(Person person) {
        try (
            PrintWriter writer = new PrintWriter(
                new FileWriter(PERSON_DATABASE, true)
            )
        ) {
            // Write the class name
            writer.println(person.getClass().getSimpleName());

            // Write basic Person information
            writer.println(person.getName());
            writer.println(person.getAddress());
            writer.println(person.getPhoneNumber());
            writer.println(person.getEmailAddress());

            // Write subclass-specific information
            if (person instanceof Faculty) {
                Faculty faculty = (Faculty) person;
                writer.println(faculty.getOffice());
                writer.println(faculty.getSalary());
                writer.println(faculty.getDateHired());
                writer.println(faculty.getOfficeHours());
                writer.println(faculty.getRank());
            } else if (person instanceof Staff) {
                Staff staff = (Staff) person;
                writer.println(staff.getOffice());
                writer.println(staff.getSalary());
                writer.println(staff.getDateHired());
                writer.println(staff.getTitle());
            } else if (person instanceof Student) {
                Student student = (Student) person;
                writer.println(student.getStatus());
            }

            // Write delimiter
            writer.println(",");
        } catch (IOException e) {
            System.out.println("Error writing to database: " + e.getMessage());
        }
    }

    /**
     * Reads all Person objects from the PersonDatabase file.
     *
     * @return ArrayList containing all Person objects from the database
     */
    public ArrayList<Person> readDatabase() {
        ArrayList<Person> persons = new ArrayList<>();

        try (
            BufferedReader reader = new BufferedReader(
                new FileReader(PERSON_DATABASE)
            )
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(",")) {
                    continue; // Skip delimiter
                }

                String className = line;
                String name = reader.readLine();
                String address = reader.readLine();
                String phoneNumber = reader.readLine();
                String emailAddress = reader.readLine();

                Person person = null;

                if (className.equals("Faculty")) {
                    String office = reader.readLine();
                    double salary = Double.parseDouble(reader.readLine());
                    String dateHired = reader.readLine();
                    String officeHours = reader.readLine();
                    String rank = reader.readLine();
                    person = new Faculty(
                        name,
                        address,
                        phoneNumber,
                        emailAddress,
                        office,
                        salary,
                        dateHired,
                        officeHours,
                        rank
                    );
                } else if (className.equals("Staff")) {
                    String office = reader.readLine();
                    double salary = Double.parseDouble(reader.readLine());
                    String dateHired = reader.readLine();
                    String title = reader.readLine();
                    person = new Staff(
                        name,
                        address,
                        phoneNumber,
                        emailAddress,
                        office,
                        salary,
                        dateHired,
                        title
                    );
                } else if (className.equals("Student")) {
                    String status = reader.readLine();
                    person = new Student(
                        name,
                        address,
                        phoneNumber,
                        emailAddress,
                        status
                    );
                }

                if (person != null) {
                    persons.add(person);
                }
            }
        } catch (IOException e) {
            System.out.println(
                "Error reading from database: " + e.getMessage()
            );
        } catch (NumberFormatException e) {
            System.out.println("Error parsing data: " + e.getMessage());
        }

        return persons;
    }
}
