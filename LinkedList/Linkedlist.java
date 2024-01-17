package LinkedList;
public class Linkedlist {
    public static Node head;
    public static Node tail;
    public static int size;
    public static  class Node{
        int data;
        Node nextNode;
       // public Node next;
        public Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"-> ");
            temp = temp.nextNode;
        }
        System.out.println("null ");
    }
    public  void addFirst(int data){
         //create new node
        Node newNode = new Node(data);
        size++;
        // when there is no node in linked list
        if(head ==null){
            head=tail = newNode;
            return;
        }
        //step 2 - newNOde next = head
        newNode.nextNode = head;// link
        //step3 - head = newNode
        head = newNode;
        
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head=tail = newNode;
            return;
        }
        tail.nextNode = newNode;
        tail = newNode;
    }
    public void addMiddle(int indx,int data){
        if(indx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i<indx-1) {
            temp = temp.nextNode;
            i++;
        }
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head=tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.nextNode;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head =tail = null;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.nextNode;
        }
        int val = prev.nextNode.data;
        prev.nextNode = null;
        tail = prev;
        size--;
        return val;
    }
    public int search(int key){
        Node temp = head;
        int i =0;
    while (temp!=null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.nextNode;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.nextNode, key);
        if(idx== -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr!=null) {
            next = curr.nextNode;
            curr.nextNode = prev;
            prev = curr;
            curr = next;
        }
        head=prev;
    }


    // find & remove Nth node from END
    public void deleteNth(int n){
        //calculate size of ll
        int sz = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.nextNode;
            sz++;
        }
        if(n == sz){
            head = head.nextNode;// remove first
            return;
        }
        // sz -n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.nextNode;
            i++;
        }
        prev.nextNode = prev.nextNode.nextNode;
        return;
    }


    // check if ll is a palindrome or not 

    //here we use slow fast technique
    public Node findMid(Node head){  // helper
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.nextNode != null){
            slow = slow.nextNode; // +1;
            fast = fast.nextNode.nextNode; // +2

        }
        return slow; // slow is my midNode
    }
    public boolean checkPali(){
        if(head == null || head.nextNode == null){
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);
        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr!=null) {
            next = curr.nextNode;
            curr.nextNode = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// tight half head
        Node left = head;
        // step 3 - check left half & right half 
        while (right!=null) {
            if(left.data !=right.data){
                return false;
            }
            left = left.nextNode;
            right = right.nextNode;
        }
        return true;
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(1);
        ll.display();
        System.out.println(ll.checkPali());
    }
}
