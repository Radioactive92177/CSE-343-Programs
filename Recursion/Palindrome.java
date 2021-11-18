package Recursion;

public class Palindrome {
    public static boolean check(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        return str.charAt(start) == str.charAt(end) && check(str, start + 1, end - 1);
    }
}
