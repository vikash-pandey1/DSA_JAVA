package Bit_manipulation;

public class Operation_ithbit {
    public static int clearRangeBits(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmash = a|b;
        return n & bitmash;
    }
    public static int clearLastIthbit(int n,int i){
        int bitmash = (~0)<<i;
        return n&bitmash;
    }
    public static int updateIthbit(int n,int i,int newbit){
        // if(newbit==0){
        //     return clearIthbit(n, i);
        // }
        // else
        // return setIthbit(n, i);
        n=clearIthbit(n,i);
        int bitmash = newbit<<i;
        return n|bitmash;

    }
    public static int clearIthbit(int n,int i){
        int bitmash = ~(1<<i);
        return n&bitmash;
    }
    public static int setIthbit(int n,int i){
        int bitmash = 1<<i;
        return n|bitmash;
    }
    public static int getIthbit(int n,int i){
        int bitmash = 1<<i;
        if((n&bitmash)==0){
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthbit(12, 2));
        System.out.println(setIthbit(24, 2));
        System.out.println(clearIthbit(12, 2));
        System.out.println(updateIthbit(12, 2, 0));
        System.out.println(clearLastIthbit(15, 2));
        System.out.println(clearRangeBits(15, 1, 2));
    }
}
