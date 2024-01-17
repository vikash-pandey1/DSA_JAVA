package Loop;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        
        // do {
        //     int no = sc.nextInt();
        //     if(no%10==0){
        //         break;
        //     }
        //     System.out.println(no);
        // } while (true);
        // sc.close();

        // continus 
        do {
            int no = sc.nextInt();
            if(no%10==0){
                continue;
            }
            System.out.println(no);
            
        } while (true);
    }
}
