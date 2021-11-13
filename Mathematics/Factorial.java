package Mathematics;

public class Factorial {
    // Iterative Solution
    public static int getI(int num) {
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Recursive solution
    public static int getR(int num) {
        if (num == 0) {
            return 1;
        }
        return num * getR(num - 1);
    }
}
