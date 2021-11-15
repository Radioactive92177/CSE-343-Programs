package Mathematics;

import java.util.*;

// Sieve of Eratosthenes
public class Eratosthenes {
    public static void print(int num) {
        if (num <= 1) {
            return;
        }

        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
