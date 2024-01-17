package ConditionalStatement;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        if(first%2==0){
            System.out.println("The no is even");
        }else{
            System.out.println("The no is odd");
        }
        sc.close();
    }
}
