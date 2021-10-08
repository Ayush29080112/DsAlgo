
public class MainClass {

	public static void main(String[] args) {
		DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
		dll.delete(0);
		dll.traverse();
		dll.createDLL("Ayush");
		dll.traverse();
		dll.insert("Vinay", 0);
		dll.traverse();
		dll.insert("Archana", 5);
		dll.traverse();
		dll.insert("Raji", 1);
		dll.traverse();
		dll.insert("Mili", 2);
		dll.traverse();
		dll.insert("Buddy", 2);

		dll.traverse();

		dll.reverseTraverse();

		dll.search("Ayush!");

		dll.delete(4);
		dll.traverse();

	}

}
