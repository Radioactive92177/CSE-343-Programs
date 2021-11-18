package Recursion;

public class SumOfN {
    public static int getSum(int num) {
        if (num == 0)
            return 0;
        return num + getSum(num - 1);
    }
}
