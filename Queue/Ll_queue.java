package Queue;

public class Ll_queue {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    static Node head = null;
        static Node tail = null;
        static int size;


    public  boolean isEmpty(){
        return head == null && tail ==null;
    }


    public  void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;   
        tail = newnode;
    }


    public  int remove(){
        if(isEmpty()){
            System.out.println("queue is emp");
            return -1;
        }
        int front = head.data;
        if(tail == head){
            tail = head = null;
        }else{
            head = head.next;
        }
        return front;
    }
    public  int peek(){
        if(isEmpty()){
            System.out.println("emp");
            return -1;
        }
        return head.data;
    } 
    public static void main(String[] args) {
        Ll_queue  l = new Ll_queue();
        l.add(1);
        l.add(2);
        l.add(3);
        while (!l.isEmpty()) {
            System.out.println(l.peek());
            l.remove();
        }
    }
}
