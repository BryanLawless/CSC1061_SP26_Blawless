public class FullRemoteCourse extends OnlineCourse {

    private String email;

    public FullRemoteCourse(
        String courseNumber,
        int numStudents,
        int maxStudents,
        int credits,
        String email
    ) {
        super(courseNumber, numStudents, maxStudents, credits);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + "Email: " + email + "\n";
    }
}
