public abstract class Vehicle implements Feedable {

    private int id;
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void drive();

    public abstract void feed(int numGallons);
}
