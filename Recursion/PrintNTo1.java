package Recursion;

public class PrintNTo1 {
    public static void print(int num){
        if(num == 0){
            return;
        }
        System.out.print(num + " ");
        print(num - 1);
    }
}
