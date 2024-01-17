package Bit_manipulation;

public class Evenodd {
    public static void evenOdd(int num){
        int bit = 1;

        if((num&bit)==0){
            System.out.println("The no is even ");
        }
        else
        System.out.println("The no is odd");
    }
    public static void main(String[] args) {
        evenOdd(2);
        evenOdd(231);
    }
}
