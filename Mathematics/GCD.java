package Mathematics;

public class GCD {
    // Using Euclidean Algorithm

    // Iterative solution
    public static int getI(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    // Recursive solution : More Optimized
    public static int getR(int num1, int num2){
        if (num2 == 0) {
            return num1;
        } else {
            return getR(num2, num1 % num2);
        }
    }
}
