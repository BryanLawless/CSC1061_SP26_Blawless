package schoolrecords;

import java.util.ArrayList;

/**
 * Driver class for testing the School Records application.
 *
 * @author Bryan Lawless
 * @version 1.0.0
 */
public class TestSchoolRecords {

    public static void main(String[] args) {
        Database db = new Database();

        // Create 2 students
        Student student1 = new Student(
            "Alice Johnson",
            "123 College Ave",
            "555-1234",
            "alice.johnson@school.edu",
            "sophomore"
        );

        Student student2 = new Student(
            "Bob Smith",
            "456 University Dr",
            "555-5678",
            "bob.smith@school.edu",
            "senior"
        );

        // Create 2 faculty members
        Faculty faculty1 = new Faculty(
            "Dr. Emily Davis",
            "789 Faculty Ln",
            "555-9012",
            "emily.davis@school.edu",
            "Building A Room 301",
            85000.00,
            "2018-08-15",
            "Mon-Wed 2-4pm",
            "senior"
        );

        Faculty faculty2 = new Faculty(
            "Dr. Michael Brown",
            "321 Professor St",
            "555-3456",
            "michael.brown@school.edu",
            "Building B Room 205",
            75000.00,
            "2020-01-10",
            "Tue-Thu 10am-12pm",
            "junior"
        );

        // Create 2 staff members
        Staff staff1 = new Staff(
            "Sarah Wilson",
            "654 Admin Blvd",
            "555-7890",
            "sarah.wilson@school.edu",
            "Administration Building Room 101",
            45000.00,
            "2019-03-20",
            "Administrative Assistant"
        );

        Staff staff2 = new Staff(
            "John Martinez",
            "987 Staff Rd",
            "555-2468",
            "john.martinez@school.edu",
            "Library Room 50",
            50000.00,
            "2017-09-01",
            "IT Support Specialist"
        );

        // Write all persons to the database
        System.out.println("Writing persons to database...\n");
        db.writePerson(student1);
        db.writePerson(student2);
        db.writePerson(faculty1);
        db.writePerson(faculty2);
        db.writePerson(staff1);
        db.writePerson(staff2);

        // Read all persons from the database
        System.out.println("Reading persons from database...\n");
        ArrayList<Person> persons = db.readDatabase();

        // Print all persons using enhanced for loop and toString()
        System.out.println("=== School Person Records ===\n");
        for (Person person : persons) {
            System.out.println(person.toString() + "\n\n");
        }
    }
}
