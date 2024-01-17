package Function;
public class Factorial {
    public static void factorial(int no){
        int fact = 1;
        while (no>0) {
            fact=fact*no;
            no--;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        factorial(5);
    }
}
