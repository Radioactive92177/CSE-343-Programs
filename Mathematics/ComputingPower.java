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

    // Binary Exponentiation(most optimized)
    public static int computeBE(int base, int power){
        int result = 1;

        while(power > 0){
            if(power % 2 != 0){
                result *= base;
            }
            base *= base;
            power /= 2;
        }
        return result;
    }
}
