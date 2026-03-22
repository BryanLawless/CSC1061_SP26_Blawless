public class Factorial {
	public static void main(String[] args) {
		int num = 18;
		System.out.println("The factorial of " + num + " is " + factorial(num));
		System.out.println("The fibannocci sequence of " + num + " is " + fibonacci(num));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		int product = n * factorial(n - 1);

		return product;
	}

	public static int fibonacci(int num) {
		if (num < 2) return num;

		int fib = fibonacci(num - 2) + fibonacci(num - 1);

		return fib;
	}
}
