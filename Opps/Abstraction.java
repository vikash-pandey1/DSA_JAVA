package Opps;

public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chican c  = new Chican();
        // c.eat();
        // c.walk();
        Mustang m = new Mustang();
        m.changeColor();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chican extends Animal{
    void changeColor(){
        color = "ligh brown";
    }
    void walk(){
        System.out.println("walk on 2 legs  ");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}
