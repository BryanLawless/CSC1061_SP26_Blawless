public class Motorbike extends Vehicle {

    public Motorbike(String color) {
        super(color);
    }

    public void drive() {
        System.out.println("The motorbike is driving");
    }

    public void feed(int numGallons) {
        System.out.println("Fed motorbike " + numGallons + "of oil.");
    }
}
