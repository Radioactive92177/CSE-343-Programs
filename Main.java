
// import Mathematics.CountDigits;
// import Mathematics.Palindrome;
// import Mathematics.Factorial;
// import Mathematics.TrailingZeros;
import Mathematics.GCD;

public class Main {
    public static void main(String[] args) {

        // Calling Mathematics.CountDigits
        // int num = 123;
        // System.out.println("Number of digits : " + CountDigits.count(num));

        // Calling Mathematics.Palindrome
        // int num = 121;
        // System.out.println("Is " + num + " a palindrome : " + Palindrome.check(num));

        // Calling Mathematics.Factorial
        // int num = 4;
        // System.out.println("Factorial of " + num + " is : " + Factorial.getI(num));
        // System.out.println("Factorial of " + num + " is : " + Factorial.getR(num));

        // Calling Mathematics.TrailingZeroes
        // int num = 10;
        // System.out.println("Number of trailing zeroes in " + num + " is : " + TrailingZeros.get(num));

        // Caliing Mathematics.GCD
        int num1 = 12, num2 = 15;
        System.out.println("GCD of " + num1 + " & " + num2 + " is " + GCD.getI(num1, num2));
        System.out.println("GCD of " + num1 + " & " + num2 + " is " + GCD.getR(num1, num2));
    }
}