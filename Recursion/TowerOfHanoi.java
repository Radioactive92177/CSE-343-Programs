package Recursion;

public class TowerOfHanoi {
    public static long solve(int noOfRings, char from, char using, char to) {
        if (noOfRings == 1) {
            System.out.println("Move " + noOfRings + " from " + from + " to " + to);
            return 1L;
        }

        solve(noOfRings - 1, from, to, using);
        System.out.println("Move " + noOfRings + " from " + from + " to " + to);
        solve(noOfRings - 1, using, from, to);
        return (long) Math.pow(2, noOfRings) - 1;
    }
}
