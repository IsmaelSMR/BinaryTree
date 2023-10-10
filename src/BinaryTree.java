import javax.swing.*;

public class BinaryTree {

    Node root;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public BinaryTree() {
        root = null;
    }

    public void insertNode(int data) {
        //crea nodo con dato int
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            insertNode(root, newNode);
        }
    }

    private void insertNode(Node parent, Node child) {
        if (child.data < parent.data) {
            //compara ints
            if (parent.left == null) {
                parent.left = child;
            } else {
                insertNode(parent.left, child);
            }
        } else {
            if (parent.right == null) {
                parent.right = child;
            } else {
                insertNode(parent.right, child);
            }
        }
    }

    // Únicos métodos de recorrido

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

}