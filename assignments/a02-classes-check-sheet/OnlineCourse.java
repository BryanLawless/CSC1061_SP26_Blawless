public class OnlineCourse extends Course {

    public OnlineCourse() {
        super();
    }

    public OnlineCourse(
        String courseNumber,
        int numStudents,
        int maxStudents,
        int credits
    ) {
        super(courseNumber, numStudents, maxStudents, credits);
    }
}
