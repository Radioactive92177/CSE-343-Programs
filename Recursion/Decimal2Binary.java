package Recursion;

public class Decimal2Binary {
    public static void convert(int num) {
        if (num == 0) {
            return;
        }

        convert(num / 2);
        System.out.print(num % 2 + " ");
    }
}