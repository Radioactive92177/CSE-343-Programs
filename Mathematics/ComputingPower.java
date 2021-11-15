package Mathematics;

public class ComputingPower {
    // Iterative Solution
    public static int computeI(int base, int power) {
        if (power == 0) {
            return 1;
        }

        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

    // Recursive solution (more optimized)
    public static int computeR(int base, int power) {
        if (power == 0) {
            return 1;
        }

        int temp = computeR(base, power / 2);
        temp *= temp;

        if (power % 2 == 0) {
            return temp;
        }
        return temp * base;
    }
}
