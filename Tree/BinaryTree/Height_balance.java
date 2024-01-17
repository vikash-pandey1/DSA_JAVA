package Tree.BinaryTree;
public class Height_balance {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // public static void preorder(Node  root){
    //     if(root == null){
    //         return;
    //     }
    //     System.out.print(root.data+" ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
    public  static boolean isBalance(Node root){
        if(root == null){
            return true;
        }
        if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        return isBalance(root.left)&& isBalance(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(isBalance(root));
    }
}
