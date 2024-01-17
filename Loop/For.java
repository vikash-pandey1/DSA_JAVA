package Loop;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        // print name 100 times 

        // for(int i=0;i<10;i++){
        //     System.out.println("nasfdlk");
        // }

        // print prime no
        // int count =0;
        // for(int i=2;i<no-1;i++){
        //     if(no%i==0){
        //         count++;
        //     }
            
        // }
        // if(count>0){
        //     System.out.println("The no is prime ");
        // }else{
        //     System.out.println("The no is not prime");
        // }
        // patten print

        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // reverse a no
        int sum =0;
        while (no>0) {
            int rem = no%10;
            no/=10;
           sum=(sum*10)+rem;
        }
        System.out.println(sum);
        sc.close();
    }
}
