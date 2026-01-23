public class Fan {

    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    private static int idCounter = 1;
    private final int id;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.id = idCounter++;
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.id = idCounter++;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan [id=" + id + ", speed=" + speed + ", color=" + color + ", radius=" + radius + "]";
        } else {
            return "Fan [id=" + id + ", color=" + color + ", radius=" + radius + ", fan is off]";
        }
    }
}
