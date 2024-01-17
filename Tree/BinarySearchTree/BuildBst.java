package Tree.BinarySearchTree;

public class BuildBst {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data<val){
            root.right = insert(root.right, val);
        }
        else{
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
    public static void main(String[] args) {
            int arr[] = {23,34,53,64,74,754,374,743,37,3464,5};
            Node root = null;
            for(int i=0;i<arr.length;i++){
                root = insert(root, arr[i]);
            }
            inorder(root);
            System.out.println();
        }
    }
