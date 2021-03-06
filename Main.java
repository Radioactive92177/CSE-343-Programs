
// import Mathematics.CountDigits;
// import Mathematics.Palindrome;
// import Mathematics.Factorial;
// import Mathematics.TrailingZeros;
// import Mathematics.GCD;
// import Mathematics.LCM;
// import Mathematics.Prime;
// import Mathematics.PrimeFactors;
// import Mathematics.PrintDivisors;
// import Mathematics.Eratosthenes;
// import Mathematics.ComputingPower;

// import Recursion.Decimal2Binary;
// import Recursion.PrintNTo1;
// import Recursion.Print1ToN;
// import Recursion.NthFibonacci;
// import Recursion.SumOfN;
// import Recursion.Palindrome;
// import Recursion.SumOfDigits;
// import Recursion.RopeCut;
// import Recursion.SubsetsOfString;
import Recursion.TowerOfHanoi;

public class Main {
    public static void main(String[] args) {

        // ? Mathematics

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
        // System.out.println("Number of trailing zeroes in " + num + " is : " +
        // TrailingZeros.get(num));

        // Caliing Mathematics.GCD
        // int num1 = 12, num2 = 15;
        // System.out.println("GCD of " + num1 + " & " + num2 + " is " + GCD.getI(num1,
        // num2));
        // System.out.println("GCD of " + num1 + " & " + num2 + " is " + GCD.getR(num1,
        // num2));

        // Calling Mathematics.LCM
        // int num1 = 12, num2 = 15;
        // System.out.println("LCM of " + num1 + " & " + num2 + " is " +
        // LCM.get(num1,num2));

        // Calling Mathematics.Prime
        // int num = 7;
        // System.out.println("Is " + num + " a prime number : " + Prime.check(num));

        // Calling Mathematics.PrimeFactors
        // int num = 12;
        // System.out.print("Prime factors of " + num + " are : ");
        // PrimeFactors.printEff(num);

        // Calling Mathematics.PrintDivisors
        // int num = 100;
        // System.out.print("Divisors of " + num + " are : ");
        // PrintDivisors.print(num);

        // Calling Mathematics.Erastosthenes
        // int num = 100;
        // System.out.print("Prime numbers between 1 to " + num + " are : ");
        // Eratosthenes.print(num);

        // Calling Mathematics.ComputingPower
        // int base = 2, power = 3;
        // System.out.println(base + " to the power " + power + " is " +
        // ComputingPower.computeBE(base, power));

        // ? Recursion

        // Calling Recursion.Decimal2Binary
        // int num = 10;
        // System.out.print("Binary equivalent of " + num + " is ");
        // Decimal2Binary.convert(num);

        // Calling Recursion.PrintNTo1
        // int num = 10;
        // System.out.print("Printing numbers from " + num + " to 1 : ");
        // PrintNTo1.print(num);

        // Calling Recursion.Print1ToN
        // int num = 10, start = 1;
        // System.out.print("Printing numbers from 1 to " + num + " : ");
        // Print1ToN.print(num);
        // System.out.print("\nPrinting numbers from 1 to " + num + " : ");
        // Print1ToN.printTR(num, start);

        // Calling Recursion.NthFibonacci
        // int num = 7;
        // System.out.println("The fibonacci number at place " + num + " is : " +
        // NthFibonacci.fib(num));

        // Calling Recursion.SumOfN
        // int num = 5;
        // System.out.println("Sum of first " + num + " natural numbers is : " +
        // SumOfN.getSum(num));

        // Calling Recursion.Palindrome
        // String str = "abba";
        // System.out.println(
        // "Is the string \"" + str + "\" a palindrome ? : " + Palindrome.check(str, 0,
        // str.length() - 1));

        // Calling Recursion.SumOfDigits
        // int num = 123;
        // System.out.println("Sum of digits of " + num + " is : " +
        // SumOfDigits.getSum(num));

        // Calling Recursion.RopeCut
        // int rope = 23, size1 = 11, size2 = 12, size3 = 9;
        // System.out.println("No. ways the rope of length " + rope + " can be cut using
        // the given sizes " + size1 + ", "
        // + size2 + ", " + size3 + " = " + RopeCut.cut(rope, size1, size2, size3));

        // Calling Recursion.SubsetsOfString
        // String str = "abc";
        // String current = "";
        // int index = 0;
        // SubsetsOfString.print(str, current, index);

        // Calling Recursion.TowerOfHanoi
        int noOfRings = 3;
        char from = 'A', to = 'C', using = 'B';
        System.out.println(TowerOfHanoi.solve(noOfRings, from, using, to));
    }
}