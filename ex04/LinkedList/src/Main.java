

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        // list.insert(25);
        // list.insert(10);
        // list.insert(8);
        // list.insert(64);
        // list.insert(77);
        list.OrderdInsert(1);
        list.OrderdInsert(7);
        list.OrderdInsert(5);
        list.display();
        list.delete(10);
        list.display();
        list.displayHeadAndTail();
    }
}
