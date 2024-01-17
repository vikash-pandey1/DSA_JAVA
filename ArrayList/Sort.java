package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(98);
        list.add(42);
        list.add(3);
        list.add(52);
        System.out.println("list before sort");
        System.out.println(list);
        System.out.println("list sort in ascending order");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("list in decending order");
        Collections.sort(list,Collections.reverseOrder());//comparator fxn
        System.out.println(list);

    }
}
