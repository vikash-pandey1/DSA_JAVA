package Function;

public class Bintodec {
    public static void BinToDec(int binn){
        int a = binn;
        int decNum = 0;
        int pow =0;
        while (binn>0) {
            int lastDig = binn%10;
            decNum=decNum+(lastDig*(int)Math.pow(2, pow));
            pow++;
            binn=binn/10;
        }
        System.out.println("dec no of "+a+" =  "+decNum);
    }
    public static void main(String[] args) {
        BinToDec(111);
    }
}
