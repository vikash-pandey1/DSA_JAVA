package ConditionalStatement;

import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        System.out.println("Enter your second no");
        int second = sc.nextInt();
        System.out.println("Enter your third no");
        int third = sc.nextInt();
        if(first>second && first>third){
            System.out.println("First if greater "+first);
        }else if(second>first && second>third){
            System.out.println("second no is greater "+second);
        }else{
            System.out.println("Third is greater "+third);
        }sc.close();

    }
}
