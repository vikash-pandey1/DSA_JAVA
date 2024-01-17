package Function;

import java.util.Scanner;

public class Function_WithParameter {
    public static void calculate(int a,int b){
        int sum = a +b;
        System.out.println("sum is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        calculate(a, b);
        sc.close();
    }
}
