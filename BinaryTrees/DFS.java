// Time Complexity: O(N) where N is the number of nodes in the binary tree as each node of the binary tree is visited exactly once.

// Space Complexity: O(N) where N is the number of nodes in the binary tree as an additional space for array is allocated to store the values of all ‘N’ nodes of the binary tree.
package BinaryTrees;

import java.util.List;
import java.util.ArrayList;

// Node class for binary tree
class Node{
    int data;
    Node left;
    Node right;

    // constructor to initialize the node with data
    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}
public class DFS {
    public static void inorderTraversal(Node node, List<Integer> result){
        if(node == null){
            return;
        }
        
        inorderTraversal(node.left, result);
        result.add(node.data);
        inorderTraversal(node.right, result);
    }

    public static void preorderTraversal(Node node, List<Integer> result){
        if(node == null){
            return;
        }
        result.add(node.data);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

    public static void postorderTraversal(Node node, List<Integer> result){
        if(node == null){
            return;
        }
        
        postorderTraversal(node.left, result);
        postorderTraversal(node.right, result);
        result.add(node.data);
    }
 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // print the inorder traversal
        System.out.println("Inorder Traversal: ");
        List<Integer> result1 = new ArrayList<>();
        inorderTraversal(root,result1);
        
        for(int a:result1){
            System.out.print(a + "");
        }

        System.out.print("\n");

        // print the preorder traversal
        System.out.println("Preorder Traversal: ");
        List<Integer> result2 = new ArrayList<>();
        preorderTraversal(root,result2);
        
        for(int a:result2){
            System.out.print(a + "");
        }

        System.out.print("\n");

        // print the postorder traversal
        System.out.println("Postorder Traversal: ");
        List<Integer> result3  = new ArrayList<>();
        postorderTraversal(root,result3);
        
        for(int a:result3){
            System.out.print(a + "");
        }

    }
}
