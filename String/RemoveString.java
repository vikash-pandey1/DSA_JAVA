package String;
public class RemoveString {
    public static  String removeOccurrences(String s, String part) {
        // StringBuffer sb = new StringBuffer();
        // String  c = String.valueOf(part.charAt(0));
        // for(int i=0;i<s.length();i++){
        //     if(String.valueOf(s.charAt(i)).equals(c)){
        //         StringBuffer ch = new StringBuffer();
        //         int a = i+3;
        //         for(int j=i;j<a;j++){
        //             ch.append(s.charAt(j));
        //         }
        //         if(part.equals(ch.toString())){
        //             i+=3;
        //         }else{
        //             sb.append(s.charAt(i));
        //         }
        //     }else{
        //         sb.append(s.charAt(i));
        //     }
        // }
        // return sb.toString();
                while(s.contains(part))
                {
                    s=s.replaceFirst(part,"");
                }
                return s;
                
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part));
        double d = Math.pow(2,6);
        System.out.println((int)d);
    }
}
