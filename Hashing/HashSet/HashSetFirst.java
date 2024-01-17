package Hashing.HashSet;
import java.util.*;
public class HashSetFirst {
    public static void main(String[] args) {
        //crating 
        HashSet<Integer> set = new HashSet<>( 0);
        // insert
        set.add(1);
        set.add(2);
        set.add(3);

        // search
        if(set.contains(1)){
            System.out.println("set containt 1");
        }
        if(!set.contains(5)){
            System.out.println("does not contain");
        }

        // delete 

        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("does not contain 1");
        // }

        // size 
        System.out.println("size of set is:"+ set.size());
        // print all element
        System.out.println(set);
        
        //Iterator
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
