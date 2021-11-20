package Recursion;

public class SubsetsOfString {
    public static void print(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        print(str, current, index + 1);
        print(str, current + str.charAt(index), index + 1);
    }
}
