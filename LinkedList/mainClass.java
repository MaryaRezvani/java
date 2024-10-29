// package MyPackage;

public class mainClass {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		LinkedList l2 = new LinkedList();


		l.insert(15);
		l.insert(12);
		l.insert(16);
		l.insert(8);
		l.printList();
		System.out.println();
		l.delete(8);
		l.printList();
		// System.out.println();
		// l2.insert2(13);
		// l2.insert2(27);
		// l2.insert2(21);
		// l2.insert2(4);
		// l2.printList();
	}

}
