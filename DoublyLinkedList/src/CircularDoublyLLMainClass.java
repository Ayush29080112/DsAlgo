
public class CircularDoublyLLMainClass {

	public static void main(String[] args) {
		CircularDoublyLinkedList<String> cdll = new CircularDoublyLinkedList<String>();
		cdll.createCircularDLL("Ayush");

		System.out.println(cdll.head.getValue());
		System.out.println(cdll.tail.getValue());

		cdll.insert("Vinay", 0);
		System.out.println(cdll.head.getValue());
		System.out.println(cdll.tail.getValue());

		cdll.insert("Archana", 2);
		cdll.traverse();
		System.out.println(cdll.head.getValue());
		System.out.println(cdll.tail.getValue());

		cdll.insert("Raji", 2);
		cdll.traverse();
		cdll.insert("Buddy", 2);

		System.out.println();
		cdll.traverse();
		System.out.println();
		cdll.reverseTraverse();
		System.out.println();

		cdll.search("Ayush");
		cdll.delete(2);

		cdll.traverse();
		System.out.println();
		cdll.reverseTraverse();
		System.out.println();
		System.out.println(cdll.tail.getNext().getValue());
		System.out.println(cdll.head.getPrev().getValue());
		cdll.deleteEntireLinkedList();
		System.out.println(cdll.head);
		System.out.println(cdll.tail);
	}
}
