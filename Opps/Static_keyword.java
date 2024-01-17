package Opps;

public class Static_keyword {
    public static void main(String[] args) {
        // Student s = new Student();
        // s.schlloName  = "gla";
        // Student s1 = new Student();
        // System.out.println(s.schlloName);

        // Student s2 =new Student();
        // s2.schlloName = "adarsh";
    }
}

class Student{

    static int returnpercentage(int math,int pht,int chem){
        return (math+pht+chem)/3;
    }
    String name;
    int roll; 

    static String schlloName;

    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
}
