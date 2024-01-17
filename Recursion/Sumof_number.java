package Recursion;

public class Sumof_number {
    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = printSum(n-1);
        int sum = n+snm1;
        return sum;
    }
    public static void main(String[] args) {
        int n =10;
        System.out.println(printSum(n));
    }
}
