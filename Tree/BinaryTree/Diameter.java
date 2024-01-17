package Tree.BinaryTree; 
public class Diameter {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lefth = height(root.left);
        int righth = height(root.right);
        int selfd = lefth+righth+1;
        return Math.max(selfd ,Math.max(ld,rd) );
    }
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam, ht);
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
       
        inorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);   
        System.out.println(diameter2(root).diam);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        
        postorder(root);
    }
}
