public class linkedlist{
    private Node head;
    // private int size;

    public class Node{
        private int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = null;
        }
    }

    public linkedlist(Node head){
        this.head= null;

    }
    public Node insert(int data)
    {
        Node node = new Node(data);
        node.next = this.head;
        head = node;
        return head;
    }
    public void display ()
    {
        Node node = head;
        //as linked list will end when Node reaches Null
        while (node != null)
        {
	        System.out.print(node.data + " ");
	        node = node.next;
        }
        System.out.println ("\n");
    }
    public void sortedInsert(int data){
        this.sortedInsert(this.head,data);

    }
    private void sortedInsert(Node node, int data){
        Node newnode = new Node(data);
        if (node == null || data < node.data){
            newnode.next = this.head;
            this.head = newnode;
        }
        else{

            // Move till we find the lastnode whose data is lesser than the data to be inserted
	        while (node.next != null && node.next.data < data)
            {
                node = node.next;
            }

            // Now make changes to next pointers accordingly
            newnode.next = node.next;
            node.next = newnode;
        }

    }



}