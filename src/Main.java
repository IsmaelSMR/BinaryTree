import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setSize(500, 600);
                frame.setVisible(true);
            }
        });


        BinaryTree tree = new BinaryTree();

        // Insert sample nodes
        tree.insertNode(25);
        tree.insertNode(20);
        tree.insertNode(36);
        tree.insertNode(10);
        tree.insertNode(22);
        tree.insertNode(30);
        tree.insertNode(40);
        tree.insertNode(5);
        tree.insertNode(12);
        tree.insertNode(28);
        tree.insertNode(38);


        System.out.print("InOrder: ");
        tree.inOrder(tree.root);

        System.out.print("\nPreOrder: ");
        tree.preOrder(tree.root);

        System.out.print("\nPostOrder: ");
        tree.postOrder(tree.root);

    }


}