package String;
public class Char_practice {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String s = "vikash";
        System.out.println(s.charAt(0));
        printletters(s);
    }
}
