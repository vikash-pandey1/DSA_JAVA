package CP;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of text cases");
        int t = sc.nextInt();
        while(t-->0){
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            System.out.println("Enter char of array");
            char arr[] = sc.next().toCharArray();
            int q =0;
        for(int i=0;i<n;i++){
            if(arr[i]=='Q'){
                q++;
            }else{
                q = Math.max(0,q-1);
            }
        }
        if(q==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        }
        sc.close();
    }
}
