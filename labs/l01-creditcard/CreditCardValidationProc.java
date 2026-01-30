public class CreditCardValidationProc {

    public static void main(String[] args) {
        long creditCardNumber = 4388576018402626L;
        System.out.println(sumOfDoubleEvenPlace(creditCardNumber));
    }

    public static boolean isValid(long number) {
        return false;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        long secondTemp = number /= 10;

        while (number > 0) {
            long num = number % 10;
            System.out.println(num);
            number /= 100;
        }

        return sum;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;

        while (number > 0) {
            long num = number % 10;
        }

        return sum;
    }

    public static int getDigit(int number) {
        return 0;
    }

    public static boolean prefixMatched(long number, int d) {
        return false;
    }

    public static int getSize(long d) {
        return 0;
    }

    public static long getPrefix(long number, int k) {
        return 0;
    }
}
