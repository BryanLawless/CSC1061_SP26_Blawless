public class Bike extends Vehicle {

    public Bike(String color) {
        super(color);
    }

    public void drive() {
        System.out.println("The bike is driving");
    }

    @Override
    public void feed(int numGallons) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Bike doesnt take oil");
    }
}
