package Tree.BinarySearchTree;

public class Valid$Bst {
    static class Node{
        int data;
        Node left,right;
        Node (int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root== null){
            root = new Node(val);
            return root;
        }
        if(root.data<val){
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean isValidBst(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min!=null && root.data  <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }
    public static void main(String[] args) {
        int values [] = { 8,5,3,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(isValidBst(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println(" not valid");
        } 
    }
}
