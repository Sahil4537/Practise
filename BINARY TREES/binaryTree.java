import java.util.*;

public class binaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //preorder sequence code
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    //preorder traversal
        public static void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    //inorder traversal
        public static void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    //postorder traveresal
        public static void postorder(Node root){
            if(root == null) {
                return ;
            }
            postorder(root.right);
            postorder(root.left);
            System.out.print(root.data);
        }

    //Level order traversal
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);

        //tree.preorder(root);
        //tree.inorder(root);
        //tree.postorder(root);
        tree.levelOrder(root);
    }
}
