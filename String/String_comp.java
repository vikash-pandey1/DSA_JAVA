package String;

public class String_comp {
    public static int match(String s[]){
        int x = 0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("++x") || s[i].equals("x++")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        String s[] = {"++x","x++","--x","x--"};
        System.out.println(match(s));
    }
}
