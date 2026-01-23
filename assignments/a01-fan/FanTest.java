public class FanTest {
	public static void main(String[] args) {

		// First fan
		Fan fanOne = new Fan(Fan.FAST, true, 10, "yellow");
		System.out.println(fanOne.toString());

		// Second fan
		Fan fanTwo = new Fan(Fan.MEDIUM, false, 5, "blue");
		System.out.println(fanTwo.toString());
	} 
}
