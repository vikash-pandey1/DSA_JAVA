package Opps;

public class Constructors {
    public static void main(String[] args) {
        Const c = new Const();
        c.name = "vikash";
        c.roll = 334;
        c.pass = "dslfkj";
        c.marks[0] = 100;
        c.marks[1] = 90;
        c.marks[2] = 80;

        Const c2 = new Const(c); //copy
        c2.pass = "viaksh123";
        c.marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println(c2.marks[i]);
        }

    }
}

class Const{ 
    String name;
    int roll;
    String pass;
    int marks[];

    //shallow  copy constructor
    // Const(Const c){
    //     marks = new int[3];
    //     this.name = c.name;
    //     this.roll = c.roll;
    //     this.marks = c.marks;  
    // }

    // deep copy constructor
    Const(Const c){
        marks = new int[3];
        this.name = c.name; 
        this.roll = c.roll;
        for(int i=0;i<3;i++){
            this.marks[i] = c.marks[i];
        }

    }

    // non-parameterized constructor 
    Const(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    // parameterized constructor
    Const(String name){
        marks = new int[3];
        this.name = name;
    }
}