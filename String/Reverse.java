package String;

public class Reverse {
    public static void main(String[] args) {
        String s = "vikash pandey";
        String rvs = "";
        for(int i=0;i<s.length();i++){
            rvs = s.charAt(i)+rvs;
        }
        System.out.println(rvs);

    }
}
