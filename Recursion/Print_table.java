package Recursion;

public class Print_table {
    public static void print(int i){
        if(i==10){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        print(i+1);
    }
    public static void main(String[] args) {
        int i=1;
        print(i);
        
    }
}
