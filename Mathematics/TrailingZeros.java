package Mathematics;

public class TrailingZeros {
    public static int get(int num) {
        int numOfZeroes = 0;

        for (int i = 5; i <= num; i *= 5) {
            numOfZeroes += (num / i);
        }
        return numOfZeroes;
    }
}
