package Recursion;

public class SumOfDigits {
    public static int getSum(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 10) + getSum(num / 10);
    }
}
