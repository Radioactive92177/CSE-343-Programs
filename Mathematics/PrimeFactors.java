package Mathematics;

public class PrimeFactors {
    public static void print(int num) {
        if (num <= 1) {
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 1) {
            System.out.print(num + "\n");
        }
    }

    // More efficient solution
    public static void printEff(int num) {
        if (num <= 1) {
            return;
        }

        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        while (num % 3 == 0) {
            System.out.print(3 + " ");
            num /= 3;
        }

        for (int i = 5; i * i <= num; i += 6) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }

            while (num % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                num /= (i + 2);
            }
        }

        if (num > 3) {
            System.out.print(num + "\n");
        }
    }
}
