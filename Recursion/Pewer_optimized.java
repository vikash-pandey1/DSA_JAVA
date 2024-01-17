package Recursion;

public class Pewer_optimized {
    public static int optimized(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimized( x,n/2);
        int halfpowersq = halfpower*halfpower;
        if(n%2!=0){
            halfpowersq = x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        System.out.println(optimized(2, 3));
    }
}
