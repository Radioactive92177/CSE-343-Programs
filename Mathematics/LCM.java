package Mathematics;

public class LCM {
    public static int get(int num1, int num2) {
        int gcd = GCD.getR(num1, num2); // Using GCD class I wrote before (Mathematics/GCD.java)
        return (num1 * num2) / gcd;
    }
}
