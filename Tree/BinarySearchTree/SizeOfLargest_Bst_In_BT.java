package Tree.BinarySearchTree;

public class SizeOfLargest_Bst_In_BT {
    static class Node{
        int data;
        Node left,right;
        Node (int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class Info{
        boolean isBSt;
        int size;
        int min;
        int max;
        public Info(boolean isBSt,int size,int min,int max){
            this.isBSt = isBSt;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBst = 0;
    public static Info largestBst(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);
        int size = leftInfo.size +rightInfo.size+1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.min(leftInfo.max, rightInfo.max));
        if(root.data <=leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBSt && rightInfo.isBSt){
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        Info info = largestBst(root);
        System.out.println("largest bst: "+maxBst);
        System.out.println(info);
    }
}
