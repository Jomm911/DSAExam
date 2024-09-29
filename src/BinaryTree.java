
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;


    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void display() {
        System.out.println("Parents: ");
        displayParents(root);
        System.out.println("\nLeaves: ");
        displayLeaves(root);
        System.out.println("\nChildren: ");
        displayChildren(root);
    }

    private void displayParents(Node node) {
        if (node != null) {
            if (node.left != null || node.right != null) {
                System.out.print(node.data + " ");
            }
            displayParents(node.left);
            displayParents(node.right);

        }
    }

    private void displayLeaves(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            displayLeaves(node.left);
            displayLeaves(node.right);
        }
    }

    private void displayChildren(Node node) {
        if (node != null) {
            if (node.left != null) {
                System.out.println(node.data + " -> " + node.left.data);
            }
            if (node.right != null) {
                System.out.println(node.data + " -> " + node.right.data);
            }
            displayChildren(node.left);
            displayChildren(node.right);
        }
    }
}