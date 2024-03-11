package DP;

public class IsValidLCS {
    public static boolean isValidLCS(String s1 ,String s2){
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }else{
                i++;
            }
        }
        return j==s2.length();
    }
    public static void main(String[] args) {
        System.out.println(isValidLCS("abcd", "ab"));
        System.out.println(isValidLCS("abcdef","abfe"));
    }
}
