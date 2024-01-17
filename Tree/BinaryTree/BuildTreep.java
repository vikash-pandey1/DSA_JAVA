package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreep {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int idx = -1;
    private  Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    //preorder
    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder
    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //postorder
    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //levelorder
    public static void levelorder(Node root ){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode== null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(currNode);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    // level order
    // public static void levelorder(Node root){
    //     if(root == null){
    //         return;
    //     }
    //     Queue<Node> q = new LinkedList<>();
    //     q.add(root);
    //     q.add(null);
    //     while (!q.isEmpty()) {
    //         Node cuuNode = q.remove();
    //         if(cuuNode== null){
    //             System.out.println();
    //             if(q.isEmpty()){
    //                 break;
    //             }else{
    //                 q.add(null);
    //             }
    //         }else{
    //             System.out.print(cuuNode.data+" ");
    //             if(cuuNode.left!=null){
    //                 q.add(cuuNode.left);
    //             }
    //             if(cuuNode.right!=null){
    //                 q.add(cuuNode.right);
    //             }
    //         }
    //     }
    // }

    // height of tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int mh = Math.max(lh, rh);
        return mh+1;
    }
    // total node of tree
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc +rc+1;
    }
    // sum of tree
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int ls = count(root.left);
        int rs = count(root.right);
        return ls+rs+root.data;
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTreep p = new BuildTreep();
        Node root = p.buildTree(nodes);
        // levelorder(root);
        // System.out.println();
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        p.inorder(root);
    }
}
