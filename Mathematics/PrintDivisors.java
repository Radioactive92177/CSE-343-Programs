package Mathematics;

public class PrintDivisors {
    public static void print(int num) {
        int i = 1;

        // Going till root of num
        for (; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        // Coming back from root of num
        for (; i >= 1; i--) {
            if (num % i == 0) {
                System.out.print((num / i) + " ");
            }
        }
    }
}
