public abstract class FI implements Comparable<FI>, Cloneable {

    private String fiName;
    private long fiId;
    private long routingNumber;
    private Address address;

    public FI(String fiName, Address address) {
        this.fiName = fiName;
        this.address = address;
    }

    public String getFiName() {
        return fiName;
    }

    public void setFiName(String fiName) {
        this.fiName = fiName;
    }

    public long getFiId() {
        return fiId;
    }

    public void setFiId(long fiId) {
        this.fiId = fiId;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public abstract double getInterestRate();

    public int compareTo(FI o) {
        if (this.fiId < o.fiId) {
            return -4;
        } else if (this.fiId > o.fiId) {
            return 4;
        }

        return 0;
    }

    public FI clone() throws CloneNotSupportedException {
        FI clone = (FI) super.clone();
        return clone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
