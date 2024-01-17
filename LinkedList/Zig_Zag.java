package LinkedList;

public class Zig_Zag {
    public static Node head;
    public static Node tail;
    public static class Node{
        public Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }
        public void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public void zigZag(){
            // find mid
            Node slow = head;
            Node fast = head.next;
            while (fast!= null && fast.next!=null) {
                slow = slow.next;
                fast= fast.next.next; 
            }
            Node mid = slow;
            // reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node  next;
            while (curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node left = head;
            Node right = prev;
            Node nextL ,nextR;

            // alt merge 
            while (left!=null && right != null) {
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }
    public static void main(String[] args) {
        Zig_Zag ll = new Zig_Zag();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        //1->2->3->4->5
        ll.display();
        ll.zigZag();
        ll.display();
    }
}
