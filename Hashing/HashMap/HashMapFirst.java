package Hashing.HashMap;

import java.util.*;
public class HashMapFirst {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        
        // insertion

        map.put("india", 34);
        map.put("us", 93);
        map.put("russia", 33);
        // System.out.println(map);
        map.put("india", 35);
        // System.out.println(map);

        // iteration on Hashmap
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String s : keys) {
            System.out.println("key = "+s+",value= "+map.get(s));
        }


        // //get
        // System.out.println(map.get("india"));

        // // search
        // if(map.containsKey("china")){
        //     System.out.println("present");
        // }else{
        //     System.out.println("not present");
        // }


        // //.get funciton

        // System.out.println(map.get("us"));
        // System.out.println(map.get("china"));

        // // remove
        // map.remove("india");
        // System.out.println(map);

        // //isEmpty
        // System.out.println(map.isEmpty());

        // // map.clear();
        // System.out.println(map);

    }
}
