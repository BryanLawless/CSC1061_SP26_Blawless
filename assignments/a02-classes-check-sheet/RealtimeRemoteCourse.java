public class RealtimeRemoteCourse extends OnlineCourse {

    private String zoomInformation;

    public RealtimeRemoteCourse(
        String courseNumber,
        int numStudents,
        int maxStudents,
        int credits,
        String zoomInformation
    ) {
        super(courseNumber, numStudents, maxStudents, credits);
        this.zoomInformation = zoomInformation;
    }

    public String getZoomInformation() {
        return zoomInformation;
    }

    public void setZoomInformation(String zoomInformation) {
        this.zoomInformation = zoomInformation;
    }

    @Override
    public String toString() {
        return (
            super.toString() + "Zoom Information: " + zoomInformation + "\n"
        );
    }
}
