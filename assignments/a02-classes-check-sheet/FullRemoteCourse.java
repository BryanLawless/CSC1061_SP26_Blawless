public class FullRemoteCourse extends OnlineCourse {

    private String email;

    public FullRemoteCourse(String email) {
        super();
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
