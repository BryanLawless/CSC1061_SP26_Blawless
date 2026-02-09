import java.util.LinkedList;
import java.util.List;

public class TestFI {

    public static void main(String[] args) {
        Bank b1 = new Bank("My bank");
        System.out.println("Intrest Rate: " + b1.getInterestRate() * 100 + "%");

        List<FI> fiList = new LinkedList<>();
        fiList.add(b1);
        fiList.add(new CreditUnion("My CU"));
        fiList.add(new NonLender("Useless Bank"));

        fiList.get(0).setFiId(2);
        fiList.get(1).setFiId(3);
        fiList.get(2).setFiId(4);

        // Collections.sort(fiList);
    }
}
