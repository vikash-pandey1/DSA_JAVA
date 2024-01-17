package Loop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        int count =0;
        for(int i=2;i<no-1;i++){
            if(no%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("The no is not prime");
        }else{
            System.out.println("The no is prime");
        }
        sc.close();
    }
}
