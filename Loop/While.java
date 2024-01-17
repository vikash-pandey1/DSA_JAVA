package Loop;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //print name 10 times
        //int count =10;
        // while (count<10) {
        //     System.out.println("name:-"+count);
        //     count++;
        // }

        // print no 10 to 1
        // while (count>0) {
        //     System.out.println(count);
        //     count--;
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no that  you want to print");
        int no = sc.nextInt();
        int sum =0;
        while (no>0) {
            sum+=no;
            no--;
        }
        System.out.println(sum);
        sc.close();
    }
}
