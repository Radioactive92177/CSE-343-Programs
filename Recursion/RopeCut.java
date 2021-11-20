package Recursion;

public class RopeCut {
    public static int cut(int rope, int size1, int size2, int size3) {
        if (rope == 0)
            return 0;
        if (rope <= -1)
            return -1;

        int res = Math.max(cut(rope - size1, size1, size2, size3),
                Math.max(cut(rope - size2, size1, size2, size3), cut(rope - size3, size1, size2, size3)));

        if (res == -1) {
            return -1;
        }
        return res + 1;
    }
}
