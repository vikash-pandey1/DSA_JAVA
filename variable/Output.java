package variable;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}
