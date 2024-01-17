package String;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name);
        String s = "Tony star";
        System.out.println(s.length());
        sc.close();
    }
}
