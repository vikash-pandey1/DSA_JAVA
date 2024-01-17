package ConditionalStatement;

import java.util.Scanner;

public class Else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        if(no>100){
            System.out.println("The no is greater than 100");
        }else if(no<100 && no>0){
            System.out.println("The no is less than 100 or equal to 100");
        }else{
            System.out.println("The no is less than 0 " );
        }
        sc.close();
    }
}
