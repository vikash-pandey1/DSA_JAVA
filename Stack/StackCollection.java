package Stack;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.size());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
