public class InPersonCourse extends Course {

    private int roomNumber;

    public InPersonCourse(int roomNumber) {
        super();
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Room Number: " + roomNumber + "\n";
    }
}
