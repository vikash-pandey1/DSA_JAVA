package ConditionalStatement;
class If_else{
    public static void main(String[] args) {
        int age = 26;
        if(age>=22){
            System.out.println("adult,drive");
        }
        if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult not drive");
        }
    }
}