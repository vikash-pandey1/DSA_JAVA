package LinkedList;
import java.util.LinkedList;
public class Ll_collection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(3);
        ll.add(1, 2);
        System.out.println(ll);
        ll.removeLast();
        ll.remove(1);
        System.out.println(ll);

    }
}
