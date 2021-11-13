package Mathematics;

public class Palindrome {
    public static boolean check(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        return temp == rev;
    }
}
