package LinkedList;

public class MergeSort {
    public  Node head;
    public static Node tail;
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  void addLast(int data){
        Node newnode = new Node(data);
        if(tail==null){
            head=tail=newnode;
            return;
        }
        tail.next = newnode;
        tail=newnode;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast!=null&& fast.next!=null) {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1!=null&& head2!=null) {
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2!= null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null ||  head.next==null ){
            return head;
        }
        // find mid
        Node mid = getMid(head);
        //left & right helf
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight=  mergeSort(rightHead);
        // merge
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        m.addLast(5);
        m.addLast(2);
        m.addLast(9);
        m.addLast(0);
        m.addLast(1); 
        m.display();
        m.head = m.mergeSort(m.head);
        m.display();
    }
}
