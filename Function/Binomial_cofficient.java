package Function;

public class Binomial_cofficient {
    public static int factorial(int n){
        int fact = 1;
        while (n>0) {
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static int binomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binom_fact = fact_n/(fact_r*fact_nmr);
        return binom_fact;
    }
    public static void main(String[] args) {
        System.out.println(binomial(3, 2));
    }
}
