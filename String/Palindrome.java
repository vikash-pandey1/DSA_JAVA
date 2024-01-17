package String;
public class Palindrome {
    public static boolean isPalindrome(String str){
        boolean result = true;
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i)==str.charAt(n-i-1)){
                //not a palindrome
                result= true;
            }
            result= false;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "raceaar";
        System.out.println(isPalindrome(str));
    }
}
