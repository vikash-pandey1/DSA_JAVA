package Function;

public class PrimeFunction {
    public static boolean prime(int no){
        // corner cases 
        if(no==1 || no==2){
            return true;
        }
        for(int i=2;i<no;i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(prime(34));
    }
}
