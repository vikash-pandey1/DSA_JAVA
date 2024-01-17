package Operator.Logical;

public class First {
    public static void main(String[] args) {
        // && logical and operator when both are true than true
        // || logical or operator when one is true than true
        // ! logical not operator when true to false false to true
        System.out.println((2<3)&&(3>1));
        System.out.println((2>3)||(3>1));
        System.out.println(!(2<3));
    }
}