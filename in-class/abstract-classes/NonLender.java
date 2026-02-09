public class NonLender extends FI {

    public NonLender(String name) {
        super(name);
    }

    public double getInterestRate() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This bank does not lend");
    }
}
