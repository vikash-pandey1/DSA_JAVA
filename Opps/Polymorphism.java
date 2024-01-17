package Opps;

public class Polymorphism {
    public static void main(String[] args) {

        // overloading
        // Calculator c = new Calculator();
        // System.out.println(c.sum(3, 3, 5));
        // System.out.println(c.sum((float)4.3,(float)53.3));
        // System.out.println(c.sum(46,6));
        Deer d = new Deer();
        d.eat();
    }
}

// method overloading
// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }
//     float sum(float a,float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c; 
//     }
// }


// method overridding
class Animal{
    void eat(){
        System.out.println("eating anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eating meat");
    }
}
