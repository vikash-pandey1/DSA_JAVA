package variable;

import java.util.Scanner;

public class Area_cercle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius");
        float f = sc.nextFloat();
        System.out.println(f*f*3.14);
        sc.close();
    }
}
