package Recursion;

public class TilingProblem {
    public static int tilingproblem(int n){ //2*n (floor size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        // int fnm1 = tilingproblem(n-1);
        // //Horizontal choice
        // int fnm2 = tilingproblem(n-2);
        // int toWays = fnm1+fnm2; 
        // return toWays; 
        return tilingproblem(n-1)+tilingproblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4 ));
    }
}
