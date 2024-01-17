package String;

public class Compress {
    public static String compress(String str){
        String newstr = "";
        for(int i=0;i<str.length();i++){
            Integer count =0;
            while (i<str.length()-1  && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            str+=str.charAt(i);
            if(count>1){
                str+=count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str = "aaaabbbb";
        System.out.println(compress(str));
    }
}
