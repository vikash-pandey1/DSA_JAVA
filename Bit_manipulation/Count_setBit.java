package Bit_manipulation;

public class Count_setBit {
    public static void main(String[] args) {
        int n = 14;
        int count = 0;
        while (n>0) {
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
