package Mathematics;

public class CountDigits{
    public static int count(int num) {
        int digits = 0;

        while (num > 0) {
            num /= 10;
            digits += 1;
        }

        return digits;
    }
}