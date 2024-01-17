package ArrayList;
import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4, 6);
        System.out.println(list);
        // get operation
        int e= list.get(2);
        System.out.println(e);
        //remove operation
        list.remove(2);
        System.out.println(list);
        //set operation at index
        list.set(2, 3);
        System.out.println(list);
        // contains operation
        System.out.println(list.contains(33));
        System.out.println(list.contains(3));
        //size mathod
        System.out.println(list.size());
        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


    }
}
