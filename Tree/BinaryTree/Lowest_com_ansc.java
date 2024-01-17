package Tree.BinaryTree;

import java.util.ArrayList;

public class Lowest_com_ansc {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 1st approach for lowest common ancestor
    public static boolean getPath(Node root ,int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }

        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root ,n1,path1);
        getPath(root,n2,path2);

        // last common ancestor
        int i= 0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        // last equal node 
        Node lca = path1.get(i-1);
        return lca;
    }

    // 2nd approach for lowest common ancestor
    public static Node lca1(Node root ,int n1,int n2){
        if(root== null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca1(root.left, n1, n2);
        Node rightlca = lca1(root.right, n1, n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4,n2 = 6;
        System.out.println(lca1(root, n1, n2).data);
    }
}