package CP;

import java.util.Scanner;

public class Bitland {
    // context 173 div 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter your no ");
        int n = sc.nextInt();
        int result =0;
        while(n-->0){
            System.out.println("Enter your operation that you want to perform");
            result+=sc.next().contains("+")?1:-1;
        }
        System.out.println(result);
        sc.close();

    }
}
