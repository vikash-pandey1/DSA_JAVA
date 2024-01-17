package String;

public class Substring {
    public static void main(String[] args) {
        String fruits [] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest );
        String s = "vikash";
        String s1 = "vikas";
        System.out.println(s.substring(0,5));
        System.out.println(s.compareTo(s1));
    }
}
