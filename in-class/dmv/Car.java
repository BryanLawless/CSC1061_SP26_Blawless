public class Car extends Vehicle {

    public Car(String color) {
        super(color);
    }

    public void drive() {
        System.out.println("The car is driving");
    }

    public void feed(int numGallons) {
        System.out.println("Fed car " + numGallons + "of oil.");
    }
}
