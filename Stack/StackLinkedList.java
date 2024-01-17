package Stack;

public class StackLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static int size;

    // isempty
    public  boolean isEmpty(){
        return head ==null;
    }

    //push
    public  void push(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop
    public  int pop(){
        size--;
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public  int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    //display
    public void display(){
        while (head!=null) {
            System.out.println(head.data);
            head = head.next;

        }
    }

     //size
    // public static int size(){
    //     Node temp = head;
    //     int a =0;
    //     while (temp!=null) {
    //         a++;
    //         temp = temp.next;
    //     }
    //     return a;
    // }

    // public static void pushAtBottom(StackLinkedList sl,int data){
    //     if(sl.isEmpty()){
    //         sl.push(data);
    //         return;
    //     }
    //     int top = sl.pop();
    //     pushAtBottom(sl, data);
    //     sl.push(top);

    // }
    public static void main(String[] args) {
        StackLinkedList sl = new StackLinkedList();
        sl.push(4);
        sl.push(3);
        sl.push(2);
        sl.push(1);
        sl.display();
        System.out.println("size of the stack is "+size);
    }
}
