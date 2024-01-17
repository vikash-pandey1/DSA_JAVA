package Tree.BinarySearchTree;

public class Search {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data<key){
            return search(root.right, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data<val){
            insert(root.right, val);
        }else{
            insert(root.left, val);
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
        int arr[] = {23,235,26,34,74,24,6,4,};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root, arr[i]);
    }
    //inorder(root);
    System.out.println();
    if(search(root, 23)){
        System.out.println("found");
    }else{
        System.out.println("Not found");
    } 
}
}
