
public class App {
    public static void main(String[] args) {

        BST bst = new BST();
        //Add nodes to the binary tree
        bst.insert(40);
        bst.insert(30);
        bst.insert(70);
        bst.insert(60);
        bst.insert(10);
        bst.insert(90);

        System.out.println("Binary search tree after insertion:");
        bst.inorder(bst.root);

        bst.delete(bst.root, 90);
        System.out.println("\nBinary search tree after deleting node 90:");
        bst.inorder(bst.root);

        //Deletes node 30 which has one child
        bst.delete(bst.root, 30);
        System.out.println("\nBinary search tree after deleting node 30:");
        bst.inorder(bst.root);

        //Deletes node 40 which has two children
        bst.delete(bst.root, 40);
        System.out.println("\nBinary search tree after deleting node 40:");
        bst.inorder(bst.root);
    }
}

