public class BST{
    public class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public BST() {
        this.root = null;
    }
    public void insert(int newData) {
        Node new_node = new Node(newData);
        if(root == null){
            root = new_node;
            return;
        }
        else {
            Node current = root, parent = null;
            while(true) {
                parent = current;
                if(newData < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = new_node;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = new_node;
                        return;
                    }
                }
            }
        }
    }
    public Node minNode(Node root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }
    public Node delete(Node node, int newData) {
        if(node == null){
            return null;
        }
        else {
            if(newData < node.data)
                node.left = delete(node.left, newData);

            else if(newData > node.data)
                node.right = delete(node.right, newData);

            else {
                if(node.left == null && node.right == null)
                    node = null;
                else if(node.left == null) {
                    node = node.right;
                }
                else if(node.right == null) {
                    node = node.left;
                }
                else {
                    Node temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = delete(node.right, temp.data);
                }
            }
            return node;
        }
    }
    public void inorder(Node node) {
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {
            if(node.left!= null)
                inorder(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorder(node.right);
        }
    }
}
