import java.util.ArrayList;

public class CSclasses {

    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();

        InPersonCourse inPerson = new InPersonCourse("CS101", 25, 30, 3, 119);

        FullRemoteCourse fullRemote = new FullRemoteCourse(
            "CS202",
            50,
            60,
            4,
            "instructor@example.com"
        );

        RealtimeRemoteCourse realtimeRemote = new RealtimeRemoteCourse(
            "CS303",
            35,
            40,
            3,
            "zoom.us/123456789"
        );

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
