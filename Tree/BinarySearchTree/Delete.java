package Tree.BinarySearchTree;

public class Delete {
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
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right= delete(root.right, val);
        }
        if(root.data>val){
            root.left = delete(root.left, val);
        }else{
            // case 1 leaf node

            if(root.left == null && root.right == null){
                return null;
            }

            // case  2 single child

            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 3 both children 

            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = { 8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root = delete(root, 10);
        System.out.println();
        
        inorder(root);
        
    }
}
