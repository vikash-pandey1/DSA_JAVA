package ConditionalStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        System.out.println("Enter your second no");
        int second = sc.nextInt();
        System.out.println("Enter your operator");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(first+second);
                break;
            case '-':
            System.out.println(first-second);
            break;
            case '*':
            System.out.println(first*second);
            break;
            case '/':
            System.out.println(first/second);
            break;
            case '%':
            System.out.println(first%second);
            break;
            default:
            System.out.println("Enter your valid input");
                break;
        }
        sc.close();
    }
}
