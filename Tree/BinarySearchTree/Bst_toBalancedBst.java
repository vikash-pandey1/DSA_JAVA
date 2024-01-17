package Tree.BinarySearchTree;

import java.util.ArrayList;

public class Bst_toBalancedBst {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void getinorder(Node root,ArrayList<Integer> al){
        if(root == null){
            return;
        }
        getinorder(root.left, al);
        al.add(root.data);
        getinorder(root.right, al);
    }
    public static Node createBst(ArrayList<Integer> al ,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(al.get(mid));
        root.left = createBst(al, st, mid-1);
        root.right = createBst(al, mid+1, end);
        return root;
    }
    public static Node balancedBst(Node root){
        // inorder seq
        ArrayList<Integer> al = new ArrayList<>();
        getinorder(root, al);

        // sorted inorder - balanced bst
        root = createBst(al, 0, al.size()-1);
        return root;

    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBst(root);
        preorder(root);
    }
}
