package Function;

public class Call_ByValue {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
       
    }
    public static void main(String[] args) {
        int a  = 10;
        int b = 5;
        swap(a, b);
         System.out.println(a);
        System.out.println(b);
    }
}
