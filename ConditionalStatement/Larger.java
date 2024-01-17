package ConditionalStatement;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        System.out.println("Enter your second no");
        int second = sc.nextInt();
        if(first>second){
            System.out.println("first is greater");
        }else{
            System.out.println("second is greater");
        }
        sc.close();
    }
}
