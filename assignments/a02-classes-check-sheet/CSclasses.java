import java.util.ArrayList;

public class CSclasses {

    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();

        InPersonCourse inPerson = new InPersonCourse(101);
        inPerson.setCourseNumber("CS101");
        inPerson.setNumStudents(25);
        inPerson.setMaxStudents(30);
        inPerson.setCredits(3);

        FullRemoteCourse fullRemote = new FullRemoteCourse(
            "instructor@example.com"
        );
        fullRemote.setCourseNumber("CS202");
        fullRemote.setNumStudents(50);
        fullRemote.setMaxStudents(60);
        fullRemote.setCredits(4);

        RealtimeRemoteCourse realtimeRemote = new RealtimeRemoteCourse(
            "zoom.us/123456789"
        );
        realtimeRemote.setCourseNumber("CS303");
        realtimeRemote.setNumStudents(35);
        realtimeRemote.setMaxStudents(40);
        realtimeRemote.setCredits(3);

        courses.add(inPerson);
        courses.add(fullRemote);
        courses.add(realtimeRemote);

        displayCourses(courses);
    }

    public static void displayCourses(ArrayList<Course> courses) {
        System.out.println("=== Course Listing ===\n");
        for (Course course : courses) {
            System.out.println("Course Number: " + course.getCourseNumber());
            System.out.println("Students: " + course.getNumStudents());
            System.out.println("Max Students: " + course.getMaxStudents());
            System.out.println("Credits: " + course.getCredits());

            if (course instanceof InPersonCourse) {
                InPersonCourse inPerson = (InPersonCourse) course;
                System.out.println("Room Number: " + inPerson.getRoomNumber());
            } else if (course instanceof FullRemoteCourse) {
                FullRemoteCourse fullRemote = (FullRemoteCourse) course;
                System.out.println("Email: " + fullRemote.getEmail());
            } else if (course instanceof RealtimeRemoteCourse) {
                RealtimeRemoteCourse realtimeRemote =
                    (RealtimeRemoteCourse) course;
                System.out.println(
                    "Zoom Information: " + realtimeRemote.getZoomInformation()
                );
            }

            System.out.println();
        }
    }
}
