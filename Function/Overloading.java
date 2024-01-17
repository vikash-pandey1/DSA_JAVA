package Function;

public class Overloading {
    // public static int sum(int a,int b){
    //     return a+b;

    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    // fun to calculate int sum
    public static int sum(int a,int b){
        return a+b;
    }

    // fun to calculate float sum
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 3));
        System.out.println(sum(1.4f,4.3f));
    }
}
