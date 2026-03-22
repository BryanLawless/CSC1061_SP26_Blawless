public class BinaryNumber {

    public static void main(String[] args) {
        decimalToBinary(276);
    }

    public static void decimalToBinary(int num) {
        if (num > 0) {
            decimalToBinary(num / 2);
            System.out.print(num % 2);
        }
    }
}
