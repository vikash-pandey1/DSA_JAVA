package Recursion;

public class Factorial {
    public static int print(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = print(n-1);
        // int fn = n*fnm1;
        // return fn;
        return n*fnm1;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(print(n));
    }
}
