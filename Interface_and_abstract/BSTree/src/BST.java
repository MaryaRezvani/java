
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class BST {
    Node root;

    public BST() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    void inorderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            inorderTraversal(node.left, result);
            result.add(node.data);
            inorderTraversal(node.right, result);
        }
    }

    List<Integer> getLE(Node node, int value) {
        List<Integer> result = new ArrayList<>();
        getLERec(node, value, result);
        Collections.sort(result);
        return result;
    }

    void getLERec(Node node, int value, List<Integer> result) {
        if (node != null) {
            if (value >= node.data) {
                getLERec(node.left, value, result);
                result.add(node.data);
                getLERec(node.right, value, result);
            } else {
                getLERec(node.left, value, result);
            }
        }
    }
}
