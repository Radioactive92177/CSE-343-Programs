package Recursion;

public class NthFibonacci {
    public static int fib(int num) {
        return num <= 1 ? num : fib(num - 1) + fib(num - 2);
    }
}
