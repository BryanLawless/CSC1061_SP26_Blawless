public class TestGeometricObject {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle("white", false, 2.0, 3.0);
        System.out.println(rect1.getArea());

        Database db = new Database();
        db.write(rect1);
        System.out.println(db.read());

        db.disconnect();
    }
}
