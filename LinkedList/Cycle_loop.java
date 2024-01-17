package LinkedList;
public class Cycle_loop {
    static Node head;
    static Node tail;
    static int size;
    static class Node{
        Node nexNode;
        int data;
        Node(int data){
            this.data=data;
            this.nexNode = null;
        }
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(size==0){
            head =tail= newNode;
            return;
        }
        newNode.nexNode = head;
        head = newNode;
    }
    public static void display(){
        Node temNode = head;
        while (temNode !=null) {
            System.out.print(temNode.data+"-->");
            temNode = temNode.nexNode;
        }
        System.out.println("null");
    }
    public static  boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast!= null&& fast.nexNode!=null) {
            slow = slow.nexNode;
            fast = fast.nexNode.nexNode;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    // remove a cycle
    public static void removeCycle(){
        // detect cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle  = false;
        while (fast!=null && fast.nexNode!=null) {
            slow = slow.nexNode;
            fast = fast.nexNode.nexNode;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle ==false){
            return;
        }
        // find meeting point 
        slow = head;
        Node prev = null;
        while (slow!=fast) {
            prev = fast;
            slow = slow.nexNode;
            fast = fast.nexNode;
        }

        // remove cycle  
        prev.nexNode = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.nexNode = temp;
        head.nexNode.nexNode = new Node(3);
        head.nexNode.nexNode.nexNode = temp;
        //1->2->3->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
