public class RealtimeRemoteCourse extends OnlineCourse {

    private String zoomInformation;

    public RealtimeRemoteCourse(String zoomInformation) {
        super();
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
