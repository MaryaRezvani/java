public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.printList(); // Output: 10 20 30

        int removedData = linkedList.removeFirst();
        System.out.println("Removed: " + removedData); // Output: Removed: 10

        linkedList.printList(); // Output: 20 30
            }
}
