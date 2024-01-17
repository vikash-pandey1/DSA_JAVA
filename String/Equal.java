package String;

public class Equal {
    public static void main(String[] args) {
        String s1 = "vikash";
        String s2 = "vikash";
        String s3 = new String("vikash");
        if(s1==s2){
            System.out.println("string are equal");
        }
        else
        System.out.println("string are not equal");
        if(s1.equals(s3)){
            System.out.println("string are equal");
        }
        else
        System.out.println("string are not equal");

    }
}
