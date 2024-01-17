package Opps;

public class Super_keyword {
    public static void main(String[] args) {
        //Shorse h = new Shorse();

    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        //super();
        System.out.println("horse constructor is called");
    }
}
class Shorse extends Horse{
    
    Shorse(){
        super();
        System.out.println("Small horse constructor is calles");
    }
}
