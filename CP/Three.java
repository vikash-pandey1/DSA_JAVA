package CP;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        char [] a= sc.next().toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>'4'){
                a[i] = (char)('9'-a[i]+'0');
            }
            if(a[i]=='0'){
                a[i] = a[i];
            }
        }
        System.out.println(a);
        sc.close();
    }
}
