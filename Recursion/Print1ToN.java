package Recursion;

public class Print1ToN {
    public static void print(int num) {
        if (num == 0) {
            return;
        }

        print(num - 1);
        System.out.print(num + " ");
    }

    // Tail Recursion //? More optimized
    public static void printTR(int num, int start) {
        if (num == 0) {
            return;
        }

        System.out.print(start + " ");
        printTR(num - 1, start + 1);
    }
}
