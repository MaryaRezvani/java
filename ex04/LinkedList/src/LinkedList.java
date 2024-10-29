

public class LinkedList {

    private Node head; // head of list
    private Node tail; // tail of list
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the end of the linked list
    // public void insert(int data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //     } else {
    //         tail.next = newNode;
    //     }
    //     tail = newNode;
    // }
    public void OrderdInsert(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            // tail = null;
            head  = new_node;
        }
        // if (tail == null) {
        //     tail = N;
        // }
        else{
            Node curreNode = head;
            while(curreNode != null){
                if(new_node.data <= curreNode.data){
                    new_node.next = curreNode;
                    // new_node = curreNode;
                }
                // tail.next = new_node;
                else if(new_node.data >= curreNode.data){
                    new_node = curreNode.next;
                    curreNode = new_node;
                }
                // tail.next = new_node;
            }

        }
    }



    public void delete(int data) {
        Node current = head;
        Node prev = null;

        // Traverse the list to find the node with the given data
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the node with the given data is found, remove it
        if (current != null) {
            // If the node to be deleted is the head
            if (prev == null) {
                head = current.next;
                // If the deleted node was the only node in the list
                if (head == null) {
                    tail = null;
                }
            } else {
                prev.next = current.next;
                // If the node to be deleted is the tail
                if (current == tail) {
                    tail = prev;
                }
            }
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayHeadAndTail() {
        if (head != null && tail != null) {
            System.out.println("Head: " + head.data);
            System.out.println("Tail: " + tail.data);
        } else {
            System.out.println("List is empty.");
        }
    }
}
