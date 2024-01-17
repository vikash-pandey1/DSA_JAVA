package String;

import java.util.Stack;

public class Reverse_notation {
    public static int reverse(String tokens[]){
        Stack<String> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].matches("\\d+")){
                s.push(tokens[i]);
            }else{
                int first = Integer.parseInt(s.pop());
                int se = Integer.parseInt(s.pop());
                int c = 0;
                if(tokens[i].equals("+"))  c = se+first;
                if(tokens[i].equals("-")) c = se-first;
                if(tokens[i].equals("*")) c = se*first;
                if(tokens[i].equals("/"))  c = se/first;
                s.push(Integer.toString(c));
            }
        }
        return Integer.parseInt(s.peek());
    }
    public static void main(String[] args) {
        String s[]= {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(reverse(s));
        
    }
}
