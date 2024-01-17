package Recursion;

public class FibnociSeries {
    public static int print(int n){
        if(n==0 || n==1){
            return n;
        }
        return print(n-1)+print(n-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.print(print(i)+" ");
        }
    }
}
