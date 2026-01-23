public class Car {
	private String color;
	private double amountOfGas;
	private int mileage;

	public Car() {
		this.color = "blue";
		this.amountOfGas = 50.0;
		this.mileage = 24;
	}

	public Car(String color, double amountOfGas, int mileage) {
		this.color = color;
		this.amountOfGas = amountOfGas;
		this.mileage = mileage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAmountOfGas() {
		return amountOfGas;
	}

	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}

	public int getMileage() {
		return mileage;
	}

	public void drive(int miles) {
		for (int i = 0; i < miles; i++) {
			this.mileage++;
			System.err.print("+");
		}

		this.amountOfGas -= miles;

		System.out.println();
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", amountOfGas=" + amountOfGas + ", mileage=" + mileage + "]";
	}
}